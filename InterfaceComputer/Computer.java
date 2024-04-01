package InterfaceComputer;


public class Computer implements NewComponents {

    private String modelMonitor;
    private String cpu;
    private String gpu;
    private int ram;
    private String powerUnit;
    private String motherboard;
    private String screenResolution;
    private int price;

    public Computer(String modelMonitor, String cpu, String gpu, int ram, String powerUnit, String motherboard, String screenResolution, int price) {
        this.modelMonitor = modelMonitor;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.powerUnit = powerUnit;
        this.motherboard = motherboard;
        this.screenResolution = screenResolution;
        this.price = price;

    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getModelMonitor() {
        return modelMonitor;
    }

    public void setModelMonitor(String modelMonitor) {
        this.modelMonitor = modelMonitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void addCpu(String cpu) {
        System.out.println(" Old cpu  " + getCpu() + " replaced with a new one  " + cpu);
    }

    public void changingResolution(String resolution) {
        System.out.println(" Changed the screen resolution from " + getScreenResolution() + " on " + resolution);
    }

    @Override
    public void addSsd(String ssd) {
        System.out.println(" Added new accessories " + ssd + " (SSD) ");
    }

    @Override
    public void addWaterCooling(String waterCooling) {
        System.out.println(" Added cooling for the cpu " + waterCooling);
    }

    @Override
    public String toString() {
        return "Computer{" + "modelMonitor='" + modelMonitor + '\'' + ", cpu='" + cpu + '\'' + ", gpu='" + gpu + '\'' + ", ram=" + ram + ", powerUnit='" + powerUnit + '\'' + ", motherboard='" + motherboard + '\'' + ", screenResolution='" + screenResolution + '\'' + ", price=" + price + " Dollars " + '}';
    }
}

