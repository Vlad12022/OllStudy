package Interface;

public interface Maintenance {

    default void maintenance() {
        System.out.println("The service includes: Oil change, oil filter, air filter");
    }


}
