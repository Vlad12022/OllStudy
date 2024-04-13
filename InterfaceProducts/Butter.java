package InterfaceProducts;

import java.time.LocalDate;

public class Butter extends Products {

    public Butter(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        super(name, id, upc, manufacturer, price, manufactureDate, expiryDate, amount);
    }


}
