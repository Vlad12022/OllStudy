package InterfaceProducts;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements ProductMoving, IDeductInventory {

    List<Product> productInWarehouse = new ArrayList<>();
    List<Product> writtenOfProducts = new ArrayList<>();

    public List<Product> getProductsInWarehouse() {
        return productInWarehouse;
    }

    public void setProductsInWarehouse(List<Product> productInWarehouse) {
        this.productInWarehouse = productInWarehouse;
    }

    public List<Product> getWrittenOfProducts() {
        return writtenOfProducts;
    }

    public void setWrittenOfProducts(List<Product> writtenOfProducts) {
        this.writtenOfProducts = writtenOfProducts;
    }

    @Override
    public void productMove(Product product) {
        productInWarehouse.add(product);

    }

    @Override
    public void removeProduct(Product product) {
        productInWarehouse.remove(product);
        writtenOfProducts.add(product);
    }

    public void printInventory() {
        StringBuilder productNames = new StringBuilder();
        for (Product product : productInWarehouse) {
            productNames.append(product.getName()).append(",");
        }
        System.out.println("Products : " + productNames + "added to the warehouse");
    }

    public void printRemoveProduct() {
        StringBuilder productNames = new StringBuilder();
        for (Product product : writtenOfProducts) {
            productNames.append(product.getName()).append(",");
        }
        System.out.println("Products : " + productNames + " were written off ");
    }

}
