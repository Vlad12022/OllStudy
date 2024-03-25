package Interface;

public abstract class MotorVehicle {
    protected int registNumber;
    protected String owner;
    protected String brand;
    protected int vin;
    protected String model;

    public MotorVehicle(int registNumber, String owner, String brand, int vin, String model) {
        this.registNumber = registNumber;
        this.owner = owner;
        this.brand = brand;
        this.vin = vin;
        this.model = model;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
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
}
