class Vehicle {
    void move() { System.out.println("Vehicle is moving"); }
}

class ElectricCar extends Vehicle {
    void charge() { System.out.println("Electric car is charging"); }
}

public class Mains {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar();
        myTesla.move();   
        myTesla.charge(); 
    }
}