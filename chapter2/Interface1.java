package InheritanceInterface;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
