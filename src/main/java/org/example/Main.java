package org.example;

import COM.STORE.CSVReader;
import COM.STORE.Store;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Store store1 = new Store(20000,"Messi");
      CSVReader reader = new CSVReader(store1);
     reader.readProductFromExcelFile("/Users/mac/Documents/STORE  MODEL PROJECT /STORE_MODEL_PROJECT2/src/main/resources/Product.xlsx");
      System.out.println("I am a footballer");
       //List<Product> addproduct = reader.readProductFromExcelFile(filePath);

        System.out.println(reader);
        //reader.readProductFromExcelFile("src/main/resources/Book 1.xlsx");

    }
}
