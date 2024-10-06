package chapter2;

public class Employee2 {
    Employee(String name) {
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
        System.out.println("Manager: " + name);
    }
}

class SuperWithParamsExample {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice");
    }
    
}
