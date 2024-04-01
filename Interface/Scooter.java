package Interface;

public class Scooter extends HumanPoweredVehicle  {
    public Scooter(String owner, String brand, String model) {
        super(owner, brand, model);
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
    public void maintenance() {
        System.out.println("The service includes: Lubrication of parts");
    }
}

