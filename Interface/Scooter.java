package Interface;

public class Scooter implements MotivePower, VehicleIdentity, Repair, Maintenance {
    private String owner;
    private String brand;
    private String model;

    public Scooter(String owner, String brand, String model) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
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

    @Override
    public void motivePower() {
        System.out.println(" Type of driving force : Human muscular strength");
    }

    @Override
    public void yourBrand() {
        System.out.println("Scooter brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Scooter model : " + getModel());
    }


    @Override
    public void repair1(Boolean rep) {
        Repair.super.repair1(rep);
    }

    @Override
    public void maintenance() {
        System.out.println("The service includes: Lubrication of parts");
    }
}

