package InterfaceComputer;

public class Computer extends TechnologicalDevice implements NewComponents {

    public Computer(CPU cpu, GPU gpu, RAM ram, int price) {
        super(cpu, gpu, ram, price);
    }
    private Motherboard motherboard;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void addSsd(String ssd) {
        System.out.println("Добавлен новый компонент : " + ssd);
    }

    @Override
    public void addWaterCooling(String waterCooling) {
        System.out.println("Добавлено охлаждение для процессора : " + waterCooling);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard=" + motherboard +
                '}';
    }
}
