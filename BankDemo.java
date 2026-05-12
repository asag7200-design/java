class Bank {

    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}


class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate is 7%");
    }
}

class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate is 10%");
    }
}

class ICICI extends Bank {

    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate is 12%");
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}