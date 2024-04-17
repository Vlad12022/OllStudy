package InterfaceProducts;

import java.time.LocalDate;

public class Milk extends Product {
    private Boolean pasteurized;

    public Milk(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        super(name, id, upc, manufacturer, price, manufactureDate, expiryDate, amount);
    }

    public Boolean getPasteurized() {
        return pasteurized;
    }

    public void setPasteurized(Boolean pasteurized) {
        this.pasteurized = pasteurized;
    }

    public void isPasteurized(Boolean pasteurized) {
        if (pasteurized) {
            System.out.println("Milk is pasteurized");
        } else System.out.println("Milk is not pasteurized");
    }


}




