package COM.STORE;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private double storeBalance;
    public String name;
    public List<Product> productList;

    public Store(double storeBalance, String name){
        this.storeBalance = storeBalance;
        this.name = name;
        this.productList = new ArrayList<>();
    }


    public Product getProduct(String name){
        for(Product product : productList){
            if(product.getName().equals(name))
                return product;

    }

        return null;
    }
public List<Product> getProductList(){
    return productList;}

public void setProductList(Product product){
        this.productList.add(product);
    }

    public double getStoreBalance() {
        return storeBalance;
    }
    public void setStoreBalance(double storeBalance){this.storeBalance = storeBalance;}
}
