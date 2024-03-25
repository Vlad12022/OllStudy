package Interface;

public class Bike extends MotorVehicle implements Maintenance, MotivePower, Refuel, Registrable, Repair, TechnicalInspection, VehicleIdentity, VinNumber {

    public Bike(int registNumber, String owner, String brand, int vin, String model) {
        super(registNumber, owner, brand, vin, model);
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
