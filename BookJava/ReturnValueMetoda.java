package BookJava;

public class ReturnValueMetoda {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 22;
        person.name = "����";
        int year1 = person.calculat();
        System.out.println("������� �������� �� ������" + year1 + "���");
         String res = person.namer();
        System.out.println( " ���� ����� " + res + " ��� �������� " + year1 + " ���� �� ������ ");

    }


}

class Person {
    String name;
    int age;

    String namer(){
        String namers = name;
        return "������";
    }

    int calculat() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("���� �����" + " " + name + " " + "��� �������� �� ������" + " " + age);
    }


}