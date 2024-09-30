package InheritanceInterface;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class Machine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

class Interface6 {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.print();
        machine.scan();
    }
}

