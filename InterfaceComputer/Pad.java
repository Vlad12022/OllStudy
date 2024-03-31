package InterfaceComputer;

import java.time.LocalDate;

public class Pad extends PortableDevice {
    public Pad(String brand, String model, String operatingSystem, int storage, String color, LocalDate releaseDate) {
        super(brand, model, operatingSystem, storage, color, releaseDate);
    }

    private boolean batteryHealth;

    public void setBatteryHealth(Boolean batteryHealth) {
        if (batteryHealth) {
            System.out.println("Батарея полностью исправна");
        } else {
            System.out.println("Разряжается быстро, нужна замена батареи!!!");
        }
    }


}
