package InterfaceComputer;

public class SSD {

 private String model;
 private int memorySize;

    public SSD(String model, int memorySize) {
        this.model = model;
        this.memorySize = memorySize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "model='" + model + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
