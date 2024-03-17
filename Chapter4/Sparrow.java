package Chapter4;

public class Sparrow extends Bird {
    public Sparrow(String name, double weight, int age, String color, boolean canSing, boolean canFly) {
        super(name, weight, age, color, canSing, canFly);
    }

    @Override
    void makeEggs() {
        System.out.println("Несет яйца");
    }

    @Override
    void canFly() {
        System.out.println("Умеет летать");
        setCanFly(true);
    }

    @Override
    void canSing() {
        System.out.println("Умеет петь");
        setCanSing(true);
    }

    @Override
    void All() {
        canFly();
        canSing();
        makeEggs();
    }
}

