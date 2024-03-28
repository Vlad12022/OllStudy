package Interface;

public abstract class HumanPoweredVehicle implements MotivePower, VehicleIdentity,Maintenance,Repair {
    protected String owner;
    protected String brand;
    protected String model;

    public HumanPoweredVehicle(String owner, String brand, String model) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
