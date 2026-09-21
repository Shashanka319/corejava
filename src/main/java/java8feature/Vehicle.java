package java8feature;


public interface Vehicle {
    public void start();
    public default void fillFuel() {
        System.out.println("Filling fuel...");
    }

}
