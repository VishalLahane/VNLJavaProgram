package InheritanceInterface;

public class Employee {
    Employee() {
        System.out.println("Employee is created");
    }
}

class Manager extends Employee {
    Manager() {
        super(); // Call to parent constructor
        System.out.println("Manager is created");
    }
}

class SuperConstructorExample {
    public static void main(String[] args) {
        Manager manager = new Manager();
    }
    
}
