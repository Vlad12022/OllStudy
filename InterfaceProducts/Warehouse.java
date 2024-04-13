package InterfaceProducts;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements ProductMoving, IDeductInventory {

    List<Products> products1 = new ArrayList<>();
    StringBuilder productsNames = new StringBuilder();
    StringBuilder res = new StringBuilder();

    @Override
    public void productMove(Products products) {
        products1.add(products);
        productsNames.append(products.getName()).append(",");
    }

    @Override
    public void removeProduct(Products product) {
        products1.remove(product);
        res.append(product.getName()).append(",");
    }

    public void printInventory() {

        System.out.println("Products : " + productsNames + "added to the warehouse");
    }

    public void printRemoveProduct() {
        System.out.println("Products : " + res + " were written off ");
    }

}
