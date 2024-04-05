package InterfaceComputer;

import java.time.LocalDate;

public class Pad extends PortableDevice {
    private boolean batteryHealth;

    public Pad(CPU cpu, GPU gpu, RAM ram, int price, String screenResolution, String model, String operatingSystem, String color, LocalDate releaseDate) {
        super(cpu, gpu, ram, price, screenResolution, model, operatingSystem, color, releaseDate);

    }

    public void setBatteryHealth(Boolean batteryHealth) {
        if (batteryHealth) {
            System.out.println("The battery is fully functional");
        } else {
            System.out.println("It runs out fast, the battery needs to be replaced!!!!");
        }
    }

    @Override
    public void displayNfcStatus() {
        if (this.isHasNFC()) {
            System.out.println("This Pad has nfc");
        } else {
            System.out.println("This Pad does not have nfc");
        }
    }

    @Override
    public void displayWirelessCharging() {
        if (this.isHasWirelessCharging()) {
            System.out.println("Supports wireless charging");
        } else {
            System.out.println("Does not support wireless charging");
        }
    }

    @Override
    public void resolutChange(String resolution) {
        System.out.println(" Changed the resolution from " + getScreenResolution() + " on " + resolution);
    }

    @Override
    public String toString() {
        return " Pad " + super.toString();

    }


}
