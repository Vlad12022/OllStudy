package Interface;

public class Bike extends Vehicle  {

    public Bike(int registNumber, String owner, String brand, int vin, String model) {
        super(registNumber, owner, brand, vin, model);
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
    public void yourBrand() {
        System.out.println("Bike brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Bike model : " + getModel());
    }


}
