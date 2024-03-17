package BookJava;

public class ReturnValueMetoda {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 22;
        person.name = "Влад";
        int year1 = person.calculat();
        System.out.println("Первому человеку до пенсии" + year1 + "лет");
         String res = person.namer();
        System.out.println( " Меня зовут " + res + " Мне осталось " + year1 + " года до пенсии ");

    }


}

class Person {
    String name;
    int age;

    String namer(){
        String namers = name;
        return "Владос";
    }

    int calculat() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут" + " " + name + " " + "Мне осталось до пенсии" + " " + age);
    }


}