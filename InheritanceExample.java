class LivingBeing {
    void breathe() {
        System.out.println("Living beings breathe.");
    }
}
class Animal extends LivingBeing {
    void eatFood() {
        System.out.println("Animals eat food.");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly.");
    }
}
class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot can speak.");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.breathe();
        p.eatFood();
        p.fly();
        p.speak();
    }
}