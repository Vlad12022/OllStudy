package InterfaceComputer;

public class CPU {
 private String model;
 private int numberCores;

    public CPU(String model, int numberCores) {
        this.model = model;
        this.numberCores = numberCores;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }


}
