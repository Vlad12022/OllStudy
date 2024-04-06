package InterfaceComputer;

public class Computer extends TechnologicalDevice implements ComponentBuilder, ComponentUpdater {

    public Computer(CPU cpu, GPU gpu, RAM ram, int price, Motherboard motherboard,SSD ssd) {
        super(cpu, gpu, ram, price);
        this.motherboard = motherboard;
        this.ssd = ssd;
    }

    private Motherboard motherboard;
    private SSD ssd;
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
        System.out.println("В компьютер добавлено новое ссд  : " + ssd);
    }

    @Override
    public void addWaterCooling(String waterCooling) {
        System.out.println(" Added cooling for the cpu : " + waterCooling);
    }

    @Override
    public String toString() {
        return super.toString() +
                "motherboard=" + motherboard +
                  " ssd " + ssd + '}';
    }


}
