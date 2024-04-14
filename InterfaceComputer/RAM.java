package InterfaceComputer;

public class RAM {

    private String model;
    private int memorySize;
    private String type;

    public RAM(String model, int memorySize, String type) {
        this.model = model;
        this.memorySize = memorySize;
        this.type = type;
    }

    public RAM(int memorySize) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (model == null && type == null) {
            return "RAM{" +
                    "memorySize=" + memorySize +
                    '}';
        } else {
            return "RAM{" +
                    "model='" + model + '\'' +
                    ", memorySize=" + memorySize +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}

