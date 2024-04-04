package InterfaceComputer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       RAM ram = new RAM("Kingston",16,"DDR4");
       GPU gpu = new GPU("Nvidia",12);
       CPU cpu = new CPU("Intel",5);

        Computer computer = new Computer(cpu,gpu,ram,300);
        computer.addSsd("Toshiba 1tb");
        computer.addWaterCooling("DeepCool");
        System.out.println(computer.toString());

        System.out.println();

       Phone phone = new Phone(cpu,gpu,ram,500,"1920:1080","Iphone","Ios","White",LocalDate.of(2001,2,12));
        System.out.println(phone.toString());
        phone.iosVersion(true);
        phone.setHasNFC(true);
        phone.displayNfcStatus();
        phone.setHasWirelessCharging(true);
        phone.displayWirelessCharging();
        phone.screenBroke(true);

        System.out.println();

        Pad pad = new Pad();

        System.out.println(pad.toString());
        pad.setBatteryHealth(false);
        pad.setHasNFC(false);
        pad.displayNfcStatus();
        pad.setHasWirelessCharging(false);
        pad.displayWirelessCharging();
    }


}
