package Interface;

public class Quadbike extends Vehicle  {
    public Quadbike(int registNumber, String owner, String brand, int vin, String model) {
        super(registNumber, owner, brand, vin, model);
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
    public void yourBrand() {
        System.out.println("Quad bike brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Quad bike model : " + getModel());
    }

}


