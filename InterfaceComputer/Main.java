package InterfaceComputer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Samsung", "Intel Core i5", "Nvidia 3060", 16, "Deep Cooling 700w", "Intel H5", "1920: 1080", 100);

        computer.addCpu("Ryzen 5");
        computer.changingResolution("1600:1230");
        computer.addSsd("Toshiba 1 tb");
        computer.addWaterCooling("Deep cool");

        Phone phone = new Phone("Айфон","xr","Ios",100,"white", LocalDate.of(2018,6,12));
        
    }


}
