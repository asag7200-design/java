class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    void fuel() {
        System.out.println("Transport uses fuel");
    }
}

class Train extends Transport {
    void move() {
        System.out.println("Train moves on tracks");
    } 

    void fuel() {
        System.out.println("Train uses diesel or electricity");
    }
}

class Bus extends Transport {
    void move() {
        System.out.println("Bus moves on roads using fuel");
    }

    void fuel() {
        System.out.println("Bus uses diesel or petrol");
    }
}

class Aeroplane extends Transport {
    void move() {
        System.out.println("Aeroplane flies in the sky");
    }

    void fuel() {
        System.out.println("Aeroplane uses aviation fuel");
    }
}

public class Main {
    public static void main(String[] args) {
        Train t = new Train();
        Bus b = new Bus();
        Aeroplane a = new Aeroplane();

        System.out.println("Train:");
        t.move();
        t.fuel();

        System.out.println("\nBus:");
        b.move();
        b.fuel();

        System.out.println("\nAeroplane:");
        a.move();
        a.fuel();
    }
}