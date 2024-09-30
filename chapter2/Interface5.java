package InheritanceInterface;

interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

class Interface5 {
    public static void main(String[] args) {
        int result = Calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}

