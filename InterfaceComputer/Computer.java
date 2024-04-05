package InterfaceComputer;

public class Computer extends TechnologicalDevice implements ComponentBuilder, ComponentUpdater {

    public Computer(CPU cpu, GPU gpu, RAM ram, int price, Motherboard motherboard) {
        super(cpu, gpu, ram, price);
        this.motherboard = motherboard;
    }

    private Motherboard motherboard;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void cpuReplacing(String cpu) {
        System.out.println("Процессор " + getCpu() + " заменен на " + cpu);
    }

    @Override
    public void addSsd(String ssd) {
        System.out.println(" add new component : " + ssd);
    }

    @Override
    public void addWaterCooling(String waterCooling) {
        System.out.println(" Added cooling for the cpu : " + waterCooling);
    }

    @Override
    public String toString() {
        return super.toString() +
                "motherboard=" + motherboard +
                '}';
    }


}
