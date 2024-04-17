package InterfaceProducts;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ProductMoving, Purchased {

    List<Product> productInShop = new ArrayList<>();
    List<Product> purchasedProducts = new ArrayList<>();


    public List<Product> getProductsInShop() {
        return productInShop;
    }

    public void setProductsInShop(List<Product> productInShop) {
        this.productInShop = productInShop;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public void productMove(Product product) {
        productInShop.add(product);

    }

    @Override
    public void buyProduct(Product product) {
        purchasedProducts.add(product);

    }

    public void printByProduct() {
        StringBuilder productNames = new StringBuilder();
        for (Product product : purchasedProducts) {
            productNames.append(product.getName()).append(",");
        }
        System.out.println("Bought the product : " + productNames.substring(0, productNames.length() - 1));
    }

    public void printProductsToShop() {
        StringBuilder productNames = new StringBuilder();
        for (Product product : productInShop) {
            productNames.append(product.getName()).append(",");
        }
        System.out.println("Products : " + productNames + "added to the trading floor ");
    }


}
