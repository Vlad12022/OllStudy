package Interface;

public class Bicycle extends HumanPoweredVehicle implements Maintenance, MotivePower, Repair, VehicleIdentity {

    public Bicycle(String owner, String brand, String model) {
        super(owner, brand, model);
    }

    @Override
    public void maintenance() {
        System.out.println("The service includes: Lubrication of the chain, replacement of bearings, checking of the stars and their replacement");
    }
    @Override
    public void motivePower() {
        System.out.println(" Type of driving force : Human muscular strength");
    }

    @Override
    public void yourBrand() {
        System.out.println("Bicycle brand : " + getBrand());
    }

    @Override
    public void model1() {
        System.out.println("Bicycle model : " + getModel());
    }

}
