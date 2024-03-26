package Interface;

public class Quadbike extends MotorVehicle implements Maintenance, MotivePower, Refuel, Registrable, Repair, TechnicalInspection, VehicleIdentity, VinNumber {
    public Quadbike(int registNumber, String owner, String brand, int vin, String model) {
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
        System.out.println("Quad bike refueled on : " + amount + " liters ");
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
        System.out.println("Quad bike brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Quad bike model : " + getModel());
    }

    @Override
    public void vinNum(String vin) {
        VinNumber.super.vinNum(vin);
    }
}


