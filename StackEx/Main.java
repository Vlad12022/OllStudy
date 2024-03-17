package StackEx;

public class Main {
    static void abc1() {
        System.out.println("abc 1 start");
        System.out.println("abc 1 end");
    }

    static void abc2() {
        System.out.println("abc 2 start");
        abc1();
        System.out.println("abc2 end");
    }

    static void abc3() {
        System.out.println("abc 3 start");
        abc2();
        System.out.println("abc 3 end");

    }

    public static void main(String[] args) {
        System.out.println("Abc start");
        abc3();
        System.out.println("Abc end");
    }


}
