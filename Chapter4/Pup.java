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
        System.out.println("Голос: тяв тяв тяв");
    }

    @Override
    void jump() {
        System.out.println("Не высоко прыгает");
    }

    @Override
    void run() {
        System.out.println("Много бегает, но не быстро");
    }

    @Override
    void bite() {
        System.out.println("Не больно кусается");
    }

    @Override
    public String toString() {
        return super.toString() + "Порода:" + getBreed();
    }
}
