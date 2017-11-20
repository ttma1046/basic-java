package package_a;

//final
public class Car {
    private static final int NUM_OF_WHEELS = 4;
    private static String engineModel = "ABD";
    private static int numTotalCars = 0;
    private String owner;
    private String model;
    private int miles;

    public Car(String owner, String model) {
        this.owner = owner;
        this.model = model;
        miles = 0;
        engineModel = "TBA";
        numTotalCars++;
    }

    public void setMiles(int miles) {
        if (miles >= this.miles) {
            this.miles = miles;
        }
    }

    public int getMiles() {
        return miles;
    }

    protected void start() {
        // NUM_OF_WHEELS = 6;
        System.out.println("starting...");
    }

    protected static void getTotalNumCars() {
        // System.out.println("owner" + owner);
        System.out.println("Total number of cars:" + numTotalCars);
    }

    class Wheel {
        // I'm inner class.
        String a = owner;
    }

    static class Engine {

    }
}
