package Interface;

public interface Repair {

    default void repair1(Boolean rep) {
        if (rep) {
            System.out.println("No repairs are required");
        } else {
            System.out.println("Repairs are required");
        }
    }


}
