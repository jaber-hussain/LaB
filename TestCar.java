class Car {
    String brand;
    String colour;
    int length;
    int weight;
    String category;

    public Car() {
    }

    public static void movingSpeed() {
        int movingSpeed = 120;
        System.out.println("Moving with 120 km/h");
    }
}

class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        System.out.println("Brand = " + car1.brand);

        car1.colour = "Black";
        System.out.println("Colour = " + car1.colour);

        car1.length = 5;
        System.out.println("Length is = " + car1.length + " feet");

        car1.weight = 100;
    }
}
