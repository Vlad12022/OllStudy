package Chapter4;

public class MainBird {
    public static void main(String[] args) {

        Bird sparrow = new Sparrow("�������", 1, 4, "�����", true, true);
        System.out.println("�������");
        sparrow.All();

        System.out.println();

        Bird hen = new Hen("�������", 5, 2, "������", false, 20, false);
        System.out.println("�������");
        hen.All();
    }
}
