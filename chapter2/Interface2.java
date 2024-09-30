package InheritanceInterface;

interface Animal {
    void sound();
}

interface Pet {
    void play();
}

class Cat implements Animal, Pet {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void play() {
        System.out.println("Cat plays");
    }
}

class Interface2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.play();
    }
}

