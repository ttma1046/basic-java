package package_a;

public class JavaPassDemo {
    public static void main(String []args) {
        Dog dog1 = new Dog("1");
        Dog dog2 = new Dog("2");
        printName("Point 1: ", dog1, dog2);

        swapDog(dog1, dog2);
        printName("point 3: ", dog1, dog2);

        swapName(dog1, dog2);
        printName("Point 5: ", dog1, dog2);
    }

    private static void swapName(Dog dog1, Dog dog2) {
        String temp = dog1.name;
        dog1.name = dog2.name;
        dog2.name = temp;

        printName("Point 4: ", dog1, dog2);
    }

    private static void swapDog(Dog dog1, Dog dog2) {
        Dog temp = dog1;
        dog1 = dog2;
        dog2 = temp;

        printName("Point 2: ", dog1, dog2);
    }

    private static void printName(String message, Dog dog1, Dog dog2) {
        System.out.printf("%s dog1.name: %s, dog2.name: %s\n", message, dog1.name, dog2.name);
    }
}

class Dog {
    String name;

    Dog(String name) { this.name = name; }
}
