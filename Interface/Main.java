package Interface;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Vlad", 7150, "Volkswagen", 12233443, "Golf");
        car.yourBrand();
        car.model1();
        car.getRegistrationNumber();
        car.vinNum("1HGCM82633A123456");
        car.motivePower();
        car.tech();
        car.repair1(true);
        car.refuel1(20);
        car.maintenance();

        System.out.println();

        Bike bike = new Bike(1274, "Gleb", "Yamaha", 1232131, " BOLT R-SPEC, 2024 ");
        bike.yourBrand();
        bike.model1();
        bike.getRegistrationNumber();
        bike.vinNum("2JGCM82633A123458");
        bike.refuel1(10);
        bike.maintenance();
        bike.repair1(false);
        bike.motivePower();
        bike.tech();

        System.out.println();

        Quadbike quadbike = new Quadbike(2520, "Vitaly", "Honda", 12323, "Talon 1000X");
        quadbike.yourBrand();
        quadbike.model1();
        quadbike.getRegistrationNumber();
        quadbike.vinNum("5HGCM82633A123459");
        quadbike.motivePower();
        quadbike.tech();
        quadbike.repair1(true);
        quadbike.refuel1(30);
        quadbike.maintenance();

        System.out.println();

        Bicycle bicycle = new Bicycle("Anton", "Stork", "113—321, 1989", 123432);
        bicycle.yourBrand();
        bicycle.model1();
        bicycle.motivePower();
        bicycle.repair1(false);
        bicycle.maintenance();

        System.out.println();

        Scooter scooter = new Scooter("Vasya", "JiLong ", "Kugoo S1");
        scooter.yourBrand();
        scooter.model1();
        scooter.motivePower();
        scooter.repair1(true);
        scooter.maintenance();


    }


}
