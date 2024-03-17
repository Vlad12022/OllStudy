package Chapter4;

public class Pup extends Animal {
    String breed;

    public Pup(String name, int age, int paws, String color, int teeth, String food, String breed) {
        super(name, age, paws, color, teeth, food);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void yelp() {
        System.out.println("�����: ��� ��� ���");
    }

    @Override
    void jump() {
        System.out.println("�� ������ �������");
    }

    @Override
    void run() {
        System.out.println("����� ������, �� �� ������");
    }

    @Override
    void bite() {
        System.out.println("�� ������ ��������");
    }

    @Override
    public String toString() {
        return super.toString() + "������:" + getBreed();
    }
}
