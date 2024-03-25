package Interface;

public interface VinNumber {

    default void vinNum(String vin) {
        System.out.println("Wine code : " + vin);
    }


}
