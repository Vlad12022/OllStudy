package InterfaceComputer;


public abstract class TechnologicalDevice {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private int price;

    public TechnologicalDevice(CPU cpu, GPU gpu, RAM ram, int price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.price = price;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TechnologicalDevice{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}






