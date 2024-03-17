package BookJava;

public abstract class Animal {

    String name;
    int leg;
    int teeth;
    int age;

    public Animal(String name, int leg, int teeth, int age) {
        this.name = name;
        this.leg = leg;
        this.teeth = teeth;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

abstract void doit ();



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", leg=" + leg +
                ", teeth=" + teeth +
                ", age=" + age +
                '}';
    }
}
