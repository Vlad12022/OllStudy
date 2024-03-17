package Chapter4;

public abstract class Bird {
    private String name;
    private double weight;
    private int age;
    private String color;
    private boolean canSing;
    private boolean canFly;

    public Bird(String name, double weight, int age, String color, boolean canSing, boolean canFly) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.canSing = canSing;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    abstract void canFly();

    abstract void makeEggs();

    abstract void canSing();

    abstract void All();
}
