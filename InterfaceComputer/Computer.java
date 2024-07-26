package InterfaceComputer;
//Создать свое соб исключение, которое будет сообщать не поддерживается
public class Computer extends TechnologicalDevice implements ComponentBuilder, ComponentUpdater {
    private Motherboard motherboard;
    private SSD ssd;
    private WaterCooling waterCooling;

    public Computer(CPU cpu, GPU gpu, RAM ram, int price, Motherboard motherboard, SSD ssd) {
        super(cpu, gpu, ram, price);
        this.motherboard = motherboard;
        this.ssd = ssd;
    }

    public WaterCooling getWaterCooling() {
        return waterCooling;
    }

    public void setWaterCooling(WaterCooling waterCooling) {
        this.waterCooling = waterCooling;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void cpuReplacing(CPU cpu) {
        CPU oldCpu = this.getCpu();
        this.setCpu(cpu);
        System.out.println(" Cpu " + oldCpu.getModel() + " replaced by " + cpu);
    }

    @Override
    public void addSsd(SSD ssd) {
        SSD oldSSD = this.getSsd();
        this.setSsd(ssd);
        System.out.println(" old ssd " + oldSSD.getModel() + " replaced by " + ssd);

    }

    @Override
    public void addWaterCooling(WaterCooling waterCooling) {
        System.out.println(" Water cooling has been added to the computer " + waterCooling);
    }

    @Override
    public String toString() {
        return super.toString() + "motherboard=" + motherboard + " ssd " + ssd + '}';
    }


}
