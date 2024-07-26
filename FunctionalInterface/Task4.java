package FunctionalInterface;

import java.util.Arrays;
import java.util.List;


import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {

        Division division = (x) -> x % 13 == 0;

        System.out.println(division.isPositive(26));

    }
}

class Task5 {
    public static void main(String[] args) {

        Longer longer = (x, y) -> {

            if (x.length() > y.length()) {

                return x;
            }
            return y;
        };
        System.out.println(longer.isLength("Привет", "Прив"));
    }
}

class Task6 {
    public static void main(String[] args) {


        SpecInterface specInterface = (b, a, c) -> b * b - 4 * a * c;

        System.out.println("Дискриминант = " + specInterface.apply(3.5, 1.5, 2.5));
    }
}

class Task10 {
    public static void main(String[] args) {
        MyInterface myInterface = (a, b, c) -> Math.max(a, Math.max(b, c));

        System.out.println("Самое большое число " + myInterface.apply(5, 10, 7));
    }
}

class Task17 {
    public static void main(String[] args) {

        Triangle triangle = (a, b, c) -> {
            if (a + c > b && b + c > a) {
                return "Можно образовать треугольник";
            } else {
                return "Нельзя образовать треугольник";
            }

        };
        System.out.println(triangle.apply(26, 5, 20));
    }
}

class Task20 {
    public static void main(String[] args) {
         Task20 task20 = new Task20();
         task20.factorial(5);
    }
    private int factorial ( int n){
            int result = 1;
            if (n == 1 || n == 0) {
                return result;
            }

            result = n * factorial(n - 1);
        System.out.println(result);
            return result;

    }
    }


class Task31 {
    public static void main(String[] args) {

        MyString myString = (String str) -> {
            StringBuilder res = new StringBuilder();
            return res.append(str).reverse().toString();

        };
        System.out.println(myString.strings("Привет"));
    }
}

class Task33 {
    public static void main(String[] args) {

        Names names = (str) -> {
            List<String> namess = Arrays.asList("Анна", "Алексей", "Борис", "Виктор", "Дмитрий");

            return namess.stream()
                    .filter(name -> {
                      return name.startsWith(str);
                    })
                    .collect(Collectors.toList());
        };
        System.out.println(names.startWith("А"));


    }
}