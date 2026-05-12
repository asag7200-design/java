abstract class Employer {
    String name;
    int id;

    Employer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}


class FullTimeEmployee extends Employer {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employer {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {

        FullTimeEmployee emp1 =
                new FullTimeEmployee("Rahul", 101, 50000);

        PartTimeEmployee emp2 =
                new PartTimeEmployee("Aman", 102, 5, 500);

        System.out.println("---- Full Time Employee ----");
        emp1.displayDetails();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        System.out.println("---- Part Time Employee ----");
        emp2.displayDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}