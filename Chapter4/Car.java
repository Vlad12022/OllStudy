package Chapter4;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;

public class Car {
    private String color;
    private String model;
    private Boolean isOn;
    private LocalDate dateBuild;
    private Engine engine;
    private Piston piston;

    public Car(String color, String model, LocalDate dateBuild, Piston piston, Engine engine) {
        this.color = color;
        this.model = model;
        this.dateBuild = dateBuild;
        this.engine = engine;
        this.piston = piston;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        this.isOn = on;
    }

    public LocalDate getDateBuild() {
        return dateBuild;
    }

    public void setDateBuild(LocalDate dateBuild) {
        this.dateBuild = dateBuild;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Piston getPiston() {
        return piston;
    }

    public void setPiston(Piston piston) {
        this.piston = piston;
    }

    //public void onEngine() {
     //   this.engine.on();
    //    System.out.println("Двигатель запущен... ");
  //  }

    public void printCylinderAndPiston() {
        this.engine.printCylinderPiston();
    }

    public void printOilReplace() {
        this.engine.oilReplace();
    }

    public void printPistonReplace() {
        this.engine.pistonReplace();
    }

    public void offEngine() {
        this.isOn = false;
        System.out.println("Двигатель заглушен , требуется диагностика !!!! ");
    }


}

class Engine implements Cloneable {
    private int Cylinder;
    private long oilWasReplaced;
    private int oilConsumption;

    public Engine(long oilWasReplaced, int oilConsumption) {
        this.oilWasReplaced = oilWasReplaced;
        this.oilConsumption = oilConsumption;
    }

    public Engine(Long oilWasReplaced) {
        this.oilWasReplaced = oilWasReplaced;
    }

    public int getCylinder() {
        return Cylinder;
    }

    public void setCylinder(int cylinder) {
        Cylinder = cylinder;
    }

    public long getOilWasReplaced() {
        return oilWasReplaced;
    }

    public void setOilWasReplaced(long oilWasReplaced) {
        this.oilWasReplaced = oilWasReplaced;
    }

    public int getOilConsumption() {
        return oilConsumption;
    }

    public void setOilConsumption(int oilConsumption) {
        this.oilConsumption = oilConsumption;
    }
public void isOn(){

}
    public void printCylinderPiston() {
        this.setCylinder(4);
        Piston piston = new Piston();
        piston.setPiston(4);
        System.out.println("Цилиндров в двигателе: " + getCylinder() + "," + " Поршней так же " + piston.getPiston());
    }

    public void oilReplace() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш пробег:");
        long mileage = scan.nextLong();
        long oilChangeMileage = getOilWasReplaced() + 7000;
        if (mileage >= oilChangeMileage) {
            System.out.println("Требуется замена масла !!!");
        } else {
            System.out.println("Замена масла пока не требуется.");
        }
    }

    public void pistonReplace() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какой у вас расход масла на 1000 км : ");
        int consumption = scan.nextInt();
        if (consumption > getOilConsumption()) {
            System.out.println("Требуется заменя поршня, расход масла больше нормы !! ");
        } else System.out.println("Расход масла в норме");
    }

}

class Piston {
    private int piston;

    public Piston() {
    }

    public int getPiston() {
        return piston;
    }

    public void setPiston(int piston) {
        this.piston = piston;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Engine engine = new Engine(200000L, 200);

        Piston piston = new Piston();
        Car car = new Car("black", "Golf", LocalDate.of(1993, 2, 12), piston, engine);
        car.printCylinderAndPiston();
      //  car.onEngine();
        car.offEngine();
        car.printOilReplace();
        car.printPistonReplace();
    }


}
