package Chapter4;

public class AnimalEx1 {
    public static void main(String[] args) {

        Dog dog = new Dog("������", 4, 4, "������", 35, "����", "�����");
        System.out.println(dog.getName());
        dog.bark();
        dog.jump();
        dog.run();
        dog.bite();
        dog.printVaccination();

        System.out.println();

        Pup pup = new Pup("�����", 1, 4, "����������", 30, "������", "����");
        System.out.println(pup.getName());
        pup.yelp();
        pup.jump();
        pup.run();
        pup.bite();
    }
}
//������� ������ ������, ����� ��������� ������ ��������, ������. ������: ������� �� ������� ���, ������ �����, �������, ������, ������