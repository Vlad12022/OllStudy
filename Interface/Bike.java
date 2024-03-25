package Interface;

public class Bike implements Maintenance, MotivePower, Refuel, Registrable, Repair, TechnicalInspection, VehicleIdentity, VinNumber {
    private int registNumber;
    private String owner;


    private String brand;
    private int vin;
    private String model;

    public Bike(int registNumber, String owner, String brand, int vin, String model) {
        this.registNumber = registNumber;
        this.owner = owner;
        this.brand = brand;
        this.vin = vin;
        this.model = model;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
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

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void maintenance() {
        Maintenance.super.maintenance();
    }

    @Override
    public void motivePower() {
        MotivePower.super.motivePower();
    }

    @Override
    public void refuel1(int amount) {
        System.out.println("The motorcycle is refueled on : " + amount + " liters ");
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("Registration number : " + getRegistNumber());
    }


    @Override
    public void repair1(Boolean rep) {
        Repair.super.repair1(rep);
    }

    @Override
    public void tech() {
        TechnicalInspection.super.tech();
    }

    @Override
    public void yourBrand() {
        System.out.println("Bike brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Bike model : " + getModel());
    }

    @Override
    public void vinNum(String vin) {
        VinNumber.super.vinNum(vin);
    }
}
