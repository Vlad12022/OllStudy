package InterfaceComputer;

import java.time.LocalDate;

public abstract class PortableDevice implements WirelessFeatures {

    private String brand;
    private String model;
    private String operatingSystem;
    private int storage;
    private String color;
    private LocalDate releaseDate;
    private boolean hasNFC;
    private boolean hasWirelessCharging;

    public PortableDevice(String brand, String model, String operatingSystem, int storage, String color, LocalDate releaseDate) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.color = color;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
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

    @Override
    public String toString() {
        return "PortableDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storage=" + storage +
                ", color='" + color + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
