package InterfaceProducts;

import java.time.LocalDate;

public abstract class  Products {

    private String name;
    private int id;
    private String upc;
    private String manufacturer;
    private int price;
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    private int amount;

    public Products(String name, int id, String upc, String manufacturer, int price, LocalDate manufactureDate, LocalDate expiryDate, int amount) {
        this.name = name;
        this.id = id;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", upc='" + upc + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                ", expiryDate=" + expiryDate +
                ", amount=" + amount +
                '}';
    }
}
