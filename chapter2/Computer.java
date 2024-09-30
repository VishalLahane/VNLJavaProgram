package InheritanceInterface;

public class Computer {
    void start() {
        System.out.println("Computer starts");
    }
}

class FinalClassInheritanceExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
