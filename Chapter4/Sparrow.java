package Chapter4;

public class Sparrow extends Bird {
    public Sparrow(String name, double weight, int age, String color, boolean canSing, boolean canFly) {
        super(name, weight, age, color, canSing, canFly);
    }

    @Override
    void makeEggs() {
        System.out.println("����� ����");
    }

    @Override
    void canFly() {
        System.out.println("����� ������");
        setCanFly(true);
    }

    @Override
    void canSing() {
        System.out.println("����� ����");
        setCanSing(true);
    }

    @Override
    void All() {
        canFly();
        canSing();
        makeEggs();
    }
}

