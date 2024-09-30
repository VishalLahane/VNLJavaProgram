package InheritanceInterface;

public class Fruit {
    Fruit() {
        System.out.println("Fruit is created");
    }
}

class Apple extends Fruit {
    Apple() {
        System.out.println("Apple is created");
    }
}

class ConstructorInheritanceExample {
    public static void main(String[] args) {
        Apple apple = new Apple();
    }
    
}
