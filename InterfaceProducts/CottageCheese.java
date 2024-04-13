package InterfaceProducts;

import java.time.LocalDate;

public class CottageCheese extends Products {
    private Boolean creamed;

    public CottageCheese(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        super(name, id, upc, manufacturer, price, manufactureDate, expiryDate, amount);
    }

    public Boolean getCreamed() {
        return creamed;
    }

    public void setCreamed(Boolean creamed) {
        this.creamed = creamed;
    }

    public void isCreamed(Boolean creamed) {
        if (creamed) {
            System.out.println("Creamy cottage cheese");
        } else {
            System.out.println("Cottage cheese is not creamy");
        }
    }


}
