package Chapter4;

public class MainBird {
    public static void main(String[] args) {

        Bird sparrow = new Sparrow("Воробей", 1, 4, "Серый", true, true);
        System.out.println("Воробей");
        sparrow.All();

        System.out.println();

        Bird hen = new Hen("Наседка", 5, 2, "Черная", false, 20, false);
        System.out.println("Наседка");
        hen.All();
    }
}
