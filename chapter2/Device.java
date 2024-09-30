package InheritanceInterface;

public class Device {
    void display() {
        System.out.println("Device display");
    }
}

class Laptop extends Device {
    void boot() {
        System.out.println("Laptop booting");
    }
}

class DowncastingExample {
    public static void main(String[] args) {
        Device device = new Laptop();
        Laptop laptop = (Laptop) device;
        laptop.boot();
    }

}
