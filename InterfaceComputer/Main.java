package InterfaceComputer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RAM ram = new RAM("Kingston", 16, "DDR4");
        GPU gpu = new GPU("Nvidia", 12);
        CPU cpu = new CPU("Intel", 5);
        Motherboard motherboard = new Motherboard("Amd", "120", "DDR4");


        Computer computer = new Computer(cpu, gpu, ram, 300, motherboard);

        System.out.println(computer.toString());
        computer.addSsd("Toshiba 1tb");
        computer.addWaterCooling("DeepCool");

        System.out.println();

        RAM phoneRAM = new RAM(3);
        GPU phoneGPU = new GPU("Apple GPU");
        CPU phoneCPU = new CPU("Apple A12 Bionic",6);

        Phone phone = new Phone(phoneCPU, phoneGPU, phoneRAM, 500, " 828 : 1792", "Iphone", "Ios", "White", LocalDate.of(2001, 2, 12));

        System.out.println(phone.toString());

        phone.iosVersion(true);
        phone.setHasNFC(true);
        phone.displayNfcStatus();
        phone.setHasWirelessCharging(true);
        phone.displayWirelessCharging();
        phone.screenBroke(true);

        System.out.println();

        RAM padRAM = new RAM(8);
        CPU padCPU = new CPU("Apple m2",8);
        GPU padGPU = new GPU("Apple m5");

        Pad pad = new Pad(padCPU,padGPU,padRAM,1000," 2048: 2732 ","Apple","Ios","Grey",LocalDate.of(2023,2,12));

        System.out.println(pad.toString());

        pad.setBatteryHealth(false);
        pad.setHasNFC(false);
        pad.displayNfcStatus();
        pad.setHasWirelessCharging(false);
        pad.displayWirelessCharging();
    }
}
