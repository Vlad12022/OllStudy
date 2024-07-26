package InterfaceComputer;

import java.time.LocalDate;

public class Phone extends PortableDevice {
    private Boolean screenBroken;
    private Boolean releasedIos;

    public Phone(CPU cpu, GPU gpu, RAM ram, int price, String screenResolution, String model, String operatingSystem, String color, LocalDate releaseDate) {
        super(cpu, gpu, ram, price, screenResolution, model, operatingSystem, color, releaseDate);
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
public void addWaterCooling() throws WaterCollingException{
        boolean isAddWaterCooling = false;

        if(!isAddWaterCooling){
            throw new WaterCollingException("Adding is not possible");

        }


}


    @Override
    public void resolutChange(String resolution) {
        System.out.println(" Changed the resolution from " + getScreenResolution() + " on " + resolution);
    }

    @Override
    public String toString() {
        return " Iphone " + super.toString();
    }


}


