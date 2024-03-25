package Interface;


public class Car extends MotorVehicle implements Registrable, VehicleIdentity, VinNumber, MotivePower, Refuel, Repair, Maintenance, TechnicalInspection {
    public Car(int registNumber, String owner, String brand, int vin, String model) {
        super(registNumber, owner, brand, vin, model);
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
        System.out.println("Car refueled on : " + amount + " Liters ");
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


