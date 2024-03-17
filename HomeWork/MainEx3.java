package HomeWork;

import java.time.LocalDate;

public class MainEx3 {
    public static void main(String[] args) {

        CPU cpu = new CPU("Intel", LocalDate.of(2021, 2, 12), "LGA1200", 6);
        RAM ram = new RAM("Samsung", 32, LocalDate.of(2022, 7, 10));
        HDD hdd = new HDD("Toshiba", 1000, LocalDate.of(2010, 4, 18));
        DiskDrive diskDrive = new DiskDrive("Sata");

        Computer computer = new Computer("Windows 11", hdd, diskDrive, ram, cpu, false);
        computer.powerOn();

        System.out.println();

        computer.start();

        System.out.println();

        computer.powerOff();
    }


}
