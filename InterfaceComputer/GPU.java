package InterfaceComputer;

public class GPU {

   private String model;
   private int  memorySize;

    public GPU(String model, int memorySize) {
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


}
