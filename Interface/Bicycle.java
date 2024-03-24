package Interface;

public class Bicycle implements Maintenance, MotivePower, Repair, VehicleIdentity {
    private String owner;
    private String brand;
    private String model;
    private int vin;

    public Bicycle(String owner, String brand, String model, int vin) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public void maintenance() {
        System.out.println("The service includes: Lubrication of the chain, replacement of bearings, checking of the stars and their replacement");
    }

    @Override
    public void motivePower() {
        System.out.println(" Type of driving force : Human muscular strength");
    }


    @Override
    public void repair1(Boolean rep) {
        Repair.super.repair1(rep);
    }

    @Override
    public void yourBrand() {
        System.out.println("Bicycle brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Bicycle model : " + getModel());
    }

}
