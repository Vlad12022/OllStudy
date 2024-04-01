package Interface;


public class Car extends Vehicle  {
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
    public void refuel1(int amount) {
        System.out.println("Car refueled on : " + amount + " Liters ");
    }


}


