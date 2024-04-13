package InterfaceProducts;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ProductMoving, Purchased {

    List<Products> productsList = new ArrayList<>();
    StringBuilder productNames = new StringBuilder();

    @Override
    public void productMove(Products products) {
        productsList.add(products);
        productNames.append(products.getName()).append(",");
    }

    @Override
    public void BuyProduct(Products products) {
        productsList.add(products);
        productNames.append(products.getName()).append(",");
    }

    public void printByProduct() {
        System.out.println("Bought the product : " + productNames.substring(0, productNames.length() - 1));
    }

    public void printProductsToShop() {
        System.out.println("Products : " + productNames + "added to the trading floor ");
    }


}
