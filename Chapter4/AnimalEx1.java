package Chapter4;

public class AnimalEx1 {
    public static void main(String[] args) {

        Dog dog = new Dog("Барбос", 4, 4, "Черный", 35, "Корм", "Немец");
        System.out.println(dog.getName());
        dog.bark();
        dog.jump();
        dog.run();
        dog.bite();
        dog.printVaccination();

        System.out.println();

        Pup pup = new Pup("Тузик", 1, 4, "Коричневый", 30, "Молоко", "Мопс");
        System.out.println(pup.getName());
        pup.yelp();
        pup.jump();
        pup.run();
        pup.bite();
    }
}
//Создать объект класса, Щенок используя классы Животное, Собака. Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать