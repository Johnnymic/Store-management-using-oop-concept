package COM.STORE;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    Store store;
    Product product;
    List<Product> products = new ArrayList<>();

    public CSVReader(Store store1) {
        this.store = store1;
    }


    public void readProductFromExcelFile(String filePath) throws IOException {



        FileInputStream fis = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet firstSheet = workbook.getSheetAt(0);

        int rowNumber = firstSheet.getLastRowNum();
        int colNumber = firstSheet.getRow(1).getLastCellNum();

        for (int row = 1; row <= rowNumber; row++) {
            String name = firstSheet.getRow(row).getCell(0).getStringCellValue();
            double price = firstSheet.getRow(row).getCell(1).getNumericCellValue();
            int quantity = (int) firstSheet.getRow(row).getCell(2).getNumericCellValue();
            String category = firstSheet.getRow(row).getCell(3).getStringCellValue();

              store.setProductList(new Product(name, price, quantity, category));
            products.add(new Product(name, price, quantity, category));
        }

    }

}

