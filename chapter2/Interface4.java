package InheritanceInterface;

interface Vehicle {
    void move();

    default void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Interface4 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.move();
    }
}

