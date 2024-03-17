package HomeWork;

import java.time.LocalDate;
import java.util.Objects;


public class Computer {
    private String system;
    private HDD hdd;
    private DiskDrive diskDrive;
    private RAM ram;
    private CPU cpu;
    boolean powerStatus;

    public Computer(String system, HDD hdd, DiskDrive diskDrive, RAM ram, CPU cpu, boolean powerStatus) {
        this.system = system;
        this.hdd = hdd;
        this.diskDrive = diskDrive;
        this.ram = ram;
        this.cpu = cpu;
        this.powerStatus = powerStatus;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public DiskDrive getDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(DiskDrive diskDrive) {
        this.diskDrive = diskDrive;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    public void powerOn() {
        System.out.println("Компьютер включен");
        powerStatus = true;

    }

    public void powerOff() {
        System.out.println("Компьютер выключен");
        powerStatus = false;
    }

    void CheckForVirus() {
        System.out.println("Идет проверка на вирусы...");
        System.out.println("Проверка завершена, вирусов не обнаружено!!");
    }

    void start() {
        CheckForVirus();
        cpu.CpuInfo();
        ram.getRamInfo();
        hdd.getInfo();
        diskDrive.canWrite();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return powerStatus == computer.powerStatus && Objects.equals(system, computer.system) && Objects.equals(hdd, computer.hdd) && Objects.equals(diskDrive, computer.diskDrive) && Objects.equals(ram, computer.ram) && Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(system, hdd, diskDrive, ram, cpu, powerStatus);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "system='" + system + '\'' +
                ", hdd=" + hdd +
                ", diskDrive=" + diskDrive +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", powerStatus=" + powerStatus +
                '}';
    }
}

class CPU {
    private String name;
    private LocalDate releaseDate;

    private String socket;
    private int numberCores;

    public CPU(String name, LocalDate releaseDate, String socket, int numberCores) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.socket = socket;
        this.numberCores = numberCores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    void CpuInfo() {
        System.out.println("Название процессора: " + getName() + "," + "Сокет:" + getSocket() + "," + "Кол-во ядер:" + getNumberCores() + "," + " Дата выпуска: " + getReleaseDate());
    }
}

class RAM {
    private String name;
    private int memory;
    private LocalDate releaseDate;

    public RAM(String name, int memory, LocalDate releaseDate) {
        this.name = name;
        this.memory = memory;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    void getRamInfo() {
        System.out.println("Оперативная память:" + getName() + "," + "дата выхода на рынок:" + getReleaseDate() + "," + " DDR 4 , кол-во памяти -" + getMemory() + " гб. ");
    }
}

class HDD {
    private String name;
    private int memory;
    private LocalDate releaseDate;

    public HDD(String name, int memory, LocalDate releaseDate) {
        this.name = name;
        this.memory = memory;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    void getInfo() {
        System.out.println("Винчестер:" + getName() + "," + "дата выхода на рынок:" + getReleaseDate() + "," + "Кол-во памяти:" + getMemory() + " гб. ");
    }
}

class DiskDrive {
    private String interfaceType;

    public DiskDrive(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    void canWrite() {
        System.out.println("Дисковод: Может записывать данные на диск");
    }

}