package InterfaceProducts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk("Milk", 12, "1238564", "Brest", 2, LocalDate.of(2024, 5, 5), LocalDate.of(2024, 6, 1), 2);
        Cheese cheese = new Cheese("Cheese", 15, "1235667", "Grodno", 3, LocalDate.of(2024, 7, 10), LocalDate.of(2024, 8, 11), 2);
        Products butter = new Butter("Butter", 22, "36547585", "Gomel", 4, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 10, 12), 2);
        CottageCheese cottageCheese = new CottageCheese("CottageCheese", 30, "5476854", "Minsk", 5, LocalDate.of(2024, 6, 6), LocalDate.of(2024, 7, 10), 2);

        List<Products> productsList = new ArrayList<>();
        productsList.add(0, milk);
        productsList.add(1, cheese);
        productsList.add(2, butter);
        productsList.add(3, cottageCheese);

        for (Products s : productsList) {
            System.out.println(s);
        }

        System.out.println();

        milk.isPasteurized(true);
        cheese.isVegetarian(false);
        cottageCheese.isCreamed(true);

        System.out.println();

        Warehouse warehouse = new Warehouse();
        warehouse.productMove(milk);
        warehouse.productMove(cheese);
        warehouse.productMove(butter);
        warehouse.productMove(cottageCheese);
        warehouse.printInventory();

        warehouse.removeProduct(milk);
        warehouse.removeProduct(butter);
        warehouse.printRemoveProduct();


        System.out.println();

        Shop shop = new Shop();
        shop.productMove(butter);
        shop.productMove(cottageCheese);
        shop.productMove(milk);
        shop.productMove(cheese);
        shop.printProductsToShop();

        shop.BuyProduct(milk);
        shop.BuyProduct(cheese);
        shop.printByProduct();


    }


}


