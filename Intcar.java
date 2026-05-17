interface Vehicle1 {
    void start();
}

class Car1 implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Scooty1 implements Vehicle {
    @Override
    public void start() {
        System.out.println("Scooty starts with kick");
    }
}

public class Intcar {
    public static void main(String[] args) {

        // Using interface reference (BEST PRACTICE)
        Vehicle v1 = new Car();
        Vehicle v2 = new Scooty();

        v1.start();
        v2.start();
    }
}