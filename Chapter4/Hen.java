package Chapter4;

public class Hen extends Bird {
    private int eggCount;

    public Hen(String name, double weight, int age, String color, boolean canSing, int eggCount, boolean canFly) {
        super(name, weight, age, color, canSing, canFly);
        this.eggCount = eggCount;
    }

    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }

    @Override
    void canFly() {
        System.out.println("�� ����� ������");
        setCanFly(false);
    }

    @Override
    void makeEggs() {
        System.out.println("����� ����");
    }

    void incubatingChicks() {
        System.out.println("���������� �������");
    }

    @Override
    void canSing() {
        System.out.println("�� ����� ����");
        setCanSing(false);
    }

    @Override
    void All() {
        canFly();
        makeEggs();
        incubatingChicks();
    }
}
