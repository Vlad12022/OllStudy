package GitHub;

public class Main {
    public static void main(String[] args) {
        java.util.function.BiFunction<Double, Double, Double> radius =
                (a, b) -> (a + b - Math.sqrt(a*a + b*b)) / 2;

        System.out.println("Радиус вписанной окружности: " + radius.apply(3.0, 4.0));
    }
}





