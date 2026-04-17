class Locker {
    private String PIN = "1243";
    private boolean isOpen = false;

    public void open(String pin) {
        if (pin.equals(PIN)) {
            isOpen = true;
            System.out.println("Locker opened successfully!");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }

    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is OPEN.");
        } else {
            System.out.println("Locker is CLOSED.");
        }
    }
}

public class pin {
    public static void main(String[] args) {
        Locker A = new Locker();

        A.checkStatus();
        A.open("1243");
        A.checkStatus();
    }
}