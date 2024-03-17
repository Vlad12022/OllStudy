package Chapter4;

public abstract class Animal {
    private String name;
    private int age;
    private int paws;
    private String color;
    private int teeth;
    private String food;

    public Animal(String name, int age, int paws, String color, int teeth, String food) {
        this.name = name;
        this.age = age;
        this.paws = paws;
        this.color = color;
        this.teeth = teeth;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    abstract void jump();

    abstract void run();

    abstract void bite();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", paws=" + paws +
                ", color='" + color + '\'' +
                ", teeth=" + teeth +
                ", food='" + food + '\'' +
                '}';
    }


}
