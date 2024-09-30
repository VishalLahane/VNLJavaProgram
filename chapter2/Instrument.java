package InheritanceInterface;

public class Instrument {
    void play() {
        System.out.println("Instrument is playing");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing");
    }
}

class UpcastingExample {
    public static void main(String[] args) {
        Instrument instrument = new Guitar(); // Upcasting
        instrument.play();
    }
}
