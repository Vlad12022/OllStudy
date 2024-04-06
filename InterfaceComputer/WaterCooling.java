package InterfaceComputer;

public class WaterCooling {

    private String model;
    private int numberCoolers;

    public WaterCooling(String model, int numberCoolers) {
        this.model = model;
        this.numberCoolers = numberCoolers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberCoolers() {
        return numberCoolers;
    }

    public void setNumberCoolers(int numberCoolers) {
        this.numberCoolers = numberCoolers;
    }

    @Override
    public String toString() {
        return "WaterCooling{" +
                "model='" + model + '\'' +
                ", numberCoolers=" + numberCoolers +
                '}';
    }
}
