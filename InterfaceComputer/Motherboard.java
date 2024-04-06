package InterfaceComputer;

public class Motherboard {

    private String model;
    private String cpuSocket;
    private String memoryType;

    public Motherboard(String model, String cpuSocket, String memoryType) {
        this.model = model;
        this.cpuSocket = cpuSocket;
        this.memoryType = memoryType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "Motherboard{" + "model='" + model + '\'' + ", cpuSocket='" + cpuSocket + '\'' + ", memoryType='" + memoryType + '\'' + '}';
    }
}
