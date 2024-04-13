package InterfaceProducts;

import java.time.LocalDate;

public class Cheese extends Products {
    private Boolean vegetarian;

    public Cheese(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        super(name, id, upc, manufacturer, price, manufactureDate, expiryDate, amount);
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void isVegetarian(Boolean vegetarian) {
        if (vegetarian) {
            System.out.println("Vegetarian cheese");
        } else {
            System.out.println("Cheese is not for vegans");
        }
    }


}
