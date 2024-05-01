package FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Zadanie4 {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = (x) -> x % 13 == 0;

        System.out.println(isPositive.test(26));


    }


}

class Zadanie5 {
    public static void main(String[] args) {

        BinaryOperator<String> isLength = (x, y) -> {

            if (x.length() > y.length()) {
              return " ������ " + x + " ������ " + " ��� " + y;
            }else {
                return " ������ " + x + " �� ������ " + " ��� " + y;
            }

        };
        System.out.println(isLength.apply("������","����"));


    }
}