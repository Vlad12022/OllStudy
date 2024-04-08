package InterfaceProducts;

import java.time.LocalDate;

public class Cheese extends Products {
    public Cheese(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        super(name, id, upc, manufacturer, price, manufactureDate, expiryDate, amount);
    }
}
