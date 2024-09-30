package InheritanceInterface;

interface Vehicle {
    void move();
}

interface Electric extends Vehicle {
    void charge();
}

class Tesla implements Electric {
    public void move() {
        System.out.println("Tesla is moving");
    }

    public void charge() {
        System.out.println("Tesla is charging");
    }
}

class Interface3 {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.move();
        tesla.charge();
    }
}

