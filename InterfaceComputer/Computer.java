package InterfaceComputer;

import java.awt.*;

public class Computer implements NewComponents {

    private String modelMonitor;
    private String cpu;
    private String gpu;
    private int ram;
    private String screenResolution;
    private int price;
    public Computer(String modelMonitor, String cpu, String gpu, int ram, String screenResolution, int price) {
        this.modelMonitor = modelMonitor;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.screenResolution = screenResolution;
        this.price = price;
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

    public void newCpu(String cpu) {
        System.out.println("Старый процессор  " + getCpu() + " заменен на " + cpu);
    }
    public void changingResolution(String resolution){
        System.out.println("Изменено разрешение экрана с " + getScreenResolution() + " на " + resolution);
    }


        }

