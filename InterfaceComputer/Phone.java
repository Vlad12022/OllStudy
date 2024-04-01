package InterfaceComputer;

import java.time.LocalDate;

public class Phone extends PortableDevice {
    private Boolean screenBroken;
    private Boolean releasedIos;

    public Phone(String brand, String model, String operatingSystem, int storage, String color, LocalDate releaseDate) {
        super(brand, model, operatingSystem, storage, color, releaseDate);
    }

    public void iosVersion(Boolean releasedIos) {
        if (releasedIos) {
            System.out.println("The latest version of iOS is installed");
        } else {
            System.out.println("An iOS update is available");
        }
    }

    public void screenBroke(Boolean screenBroken) {
        if (screenBroken) {
            System.out.println("The screen is broken, a replacement is needed");
        } else {
            System.out.println("The screen is in good condition");
        }
    }

    @Override
    public void displayNfcStatus() {
        if (this.isHasNFC()) {
            System.out.println("This phone has nfc");
        } else {
            System.out.println("This phone does not have NFC");
        }
    }

    @Override
    public void displayWirelessCharging() {
        if (this.isHasNFC()) {
            System.out.println("Supports wireless charging");
        } else {
            System.out.println("Does not support wireless charging");
        }
    }
}


