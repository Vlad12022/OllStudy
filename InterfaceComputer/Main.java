package InterfaceComputer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Samsung", "Intel Core i5", "Nvidia 3060", 16, "DeepCool PF650 ", "Intel H5", "1920: 1080", 300);
        System.out.println(computer.toString());
        computer.addCpu("AMD Ryzen 5 4500");
        computer.changingResolution("1680:1050");
        computer.addSsd("Toshiba 1 tb");
        computer.addWaterCooling("Deep—ool LS720 ");

        System.out.println();

        Phone phone = new Phone("¿ÈÙÓÌ","xr","Ios",100,"white", LocalDate.of(2018,6,12));
        System.out.println(phone.toString());
        phone.screenBroke(true);
        phone.iosVersion(true);

        System.out.println();

        Pad pad = new Pad("Samsung","Galaxy","Indroid",500,"Black",LocalDate.of(2021,5,12));
        System.out.println(pad.toString());
        pad.setBatteryHealth(false);
    }


}
