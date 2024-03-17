package Chapter4;

public class Dog extends Animal {

    private String breed;
    private boolean vaccination;

    public Dog(String name, int age, int paws, String color, int teeth, String food, String breed) {
        super(name, age, paws, color, teeth, food);
        this.breed = breed;
        this.vaccination = vaccination;
    }
    void printVaccination(){
        System.out.println("Привит");
        vaccination = true;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public void bark() {
        System.out.println("Голос: ГАВ ГАВ ГАВ");
    }

    @Override
    void jump() {
        System.out.println("Прыгает 2 метра в высоту");
    }

    @Override
    void run() {
        System.out.println("Очень быстро бегает");
    }

    @Override
    void bite() {
        System.out.println("Очень больно кусается");
    }

    @Override
    public String toString() {
        return super.toString() + ", Порода: " + getBreed();
    }
}
