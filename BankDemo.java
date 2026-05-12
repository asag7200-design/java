// Parent class
class Bank {

    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}

// Child class SBI
class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate is 7%");
    }
}

// Child class HDFC
class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate is 10%");
    }
}

// Child class ICICI
class ICICI extends Bank {

    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate is 12%");
    }
}

// Main class
public class BankDemo {

    public static void main(String[] args) {

        // Parent class reference and child class objects
        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}