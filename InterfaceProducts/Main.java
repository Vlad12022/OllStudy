package InterfaceProducts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Products milk = new Milk("Простоквашино", 12, "1238564", "Брест", 2, LocalDate.of(2024, 5, 5), LocalDate.of(2024, 6, 1), 2);
        Products cheese = new Cheese("fdfdf", 15, "1235667", "Гродно", 3, LocalDate.of(2024, 7, 10), LocalDate.of(2024, 8, 11), 2);
        Products butter = new Butter("fgg", 22, "36547585", "Гомель", 4, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 10, 12), 2);
        Products cottageCheese = new CottageCheese("gdfgdfg", 30, "5476854", "Минск", 5, LocalDate.of(2024, 6, 6), LocalDate.of(2024, 7, 10), 2);

        List<Products> productsList = new ArrayList<>();
        productsList.add(0, milk);
        productsList.add(1, cheese);
        productsList.add(2, butter);
        productsList.add(3, cottageCheese);

        for (Products s : productsList) {
            System.out.println(s);
        }
    }
}
