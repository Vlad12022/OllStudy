package GitHub;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        BinaryOperator<Double> radius = (a, b) -> {
            double c = Math.sqrt(a * a + b * b);
            return (a + b - c) / 2;
        };
        System.out.println("Радиус вписанной окружности равен : " + radius.apply(20.0, 14.0));


    }
}





