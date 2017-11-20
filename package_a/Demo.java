package package_a;

public class Demo {
    public static void main(String[] args) {
        Car.getTotalNumCars();
        final Car bobCar = new Car("Bob", "BMW");
        bobCar.start();

        Car claireCar = new Car("Claire", "Volve");
        bobCar.getTotalNumCars();
        claireCar.getTotalNumCars();

        Car.getTotalNumCars();

        // bobCar = new Car("test", "test");

        bobCar.setMiles(100);
    }
}
