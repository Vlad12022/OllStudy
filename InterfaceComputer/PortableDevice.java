package InterfaceComputer;

import java.time.LocalDate;

public abstract class PortableDevice extends TechnologicalDevice implements WirelessCapabilityChecker {
    public PortableDevice(CPU cpu, GPU gpu, RAM ram, int price, String screenResolution, String model, String operatingSystem, String color, LocalDate releaseDate) {
        super(cpu, gpu, ram, price);
        this.screenResolution = screenResolution;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.releaseDate = releaseDate;
    }

    private String screenResolution;
    private String model;
    private String operatingSystem;
    private String color;
    private LocalDate releaseDate;
    private boolean hasNFC;
    private boolean hasWirelessCharging;

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isHasNFC() {
        return hasNFC;
    }

    public void setHasNFC(boolean hasNFC) {
        this.hasNFC = hasNFC;
    }

    public boolean isHasWirelessCharging() {
        return hasWirelessCharging;
    }

    public void setHasWirelessCharging(boolean hasWirelessCharging) {
        this.hasWirelessCharging = hasWirelessCharging;
    }

    @Override
    public String toString() {
        return super.toString() +
                "screenResolution='" + screenResolution + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ", releaseDate=" + releaseDate;


    }
}
