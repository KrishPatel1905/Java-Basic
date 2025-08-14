// Abstract base class
abstract class Instrument {
    abstract void play();
    String what() {
        return "Instrument";
    }
    abstract void adjust();
}

// Wind instrument
class Wind extends Instrument {
    void play() {
        System.out.println("Wind instrument played");
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Instrument tuned properly");
    }
}

// Percussion instrument
class Percussion extends Instrument {
    void play() {
        System.out.println("Percussion instrument played");
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("Instrument tuned properly");
    }
}

// Stringed instrument
class Stringed extends Instrument {
    void play() {
        System.out.println("Stringed instrument played");
    }
    String what() {
        return "Stringed";
    }
    void adjust() {
        System.out.println("Instrument tuned properly");
    }
}

// Woodwind extends Wind
class Woodwind extends Wind {
    void play() {
        System.out.println("Woodwind instrument played");
    }
    String what() {
        return "Woodwind";
    }
}

// Brass extends Wind
class Brass extends Wind {
    void play() {
        System.out.println("Brass instrument played");
    }
    String what() {
        return "Brass";
    }
}

// Test class
public class test {
    public static void main(String[] args) {
        Wind w = new Wind();
        Percussion p = new Percussion();
        Stringed s = new Stringed();
        Woodwind ww = new Woodwind();
        Brass b = new Brass();

        // Separate calls
        w.play();
        System.out.println("Name: " + w.what());
        w.adjust();

        System.out.println();

        p.play();
        System.out.println("Name: " + p.what());
        p.adjust();

        System.out.println();

        s.play();
        System.out.println("Name: " + s.what());
        s.adjust();

        System.out.println();

        ww.play();
        System.out.println("Name: " + ww.what());
        ww.adjust();

        System.out.println();

        b.play();
        System.out.println("Name: " + b.what());
        b.adjust();
    }
}
