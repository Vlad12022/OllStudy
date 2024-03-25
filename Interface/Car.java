package Interface;


public class Car implements Registrable, VehicleIdentity, VinNumber, MotivePower, Refuel, Repair, Maintenance, TechnicalInspection {
    private String owner;
    private int registNumber;
    private String brand;
    private int vin;
    private String model;
    private int fuel;

    public Car(String owner, int registNumber, String brand, int vin, String model) {
        this.owner = owner;
        this.registNumber = registNumber;
        this.brand = brand;
        this.vin = vin;
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
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
    public void getRegistrationNumber() {
        System.out.println("Registration number : " + getRegistNumber());
    }

    @Override
    public void yourBrand() {
        System.out.println("Car brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Car model : " + getModel());
    }

    @Override
    public void vinNum(String vin) {
        System.out.println("Wine code :" + vin);
    }

    @Override
    public void motivePower() {
        MotivePower.super.motivePower();
    }

    @Override
    public void refuel1(int amount) {
        this.fuel += amount;
        System.out.println("The car is refueled on " + amount + " liters");
    }

    @Override
    public void repair1(Boolean rep) {
        Repair.super.repair1(rep);
    }

    @Override
    public void maintenance() {
        Maintenance.super.maintenance();
    }

    @Override
    public void tech() {
        TechnicalInspection.super.tech();
    }
}


