package BookJava;

public class MetodSperemChislom {

    static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        printNumbers(5, 7, 8, 9, 10);
        printNumbers(2, 4);
    }
}

class Test {
    public static void printArguments(Object... args) {
        System.out.println(" Object args " + args.length);
    }

    public static void main(String[] args) {
        printArguments(5, 7);


    }


}