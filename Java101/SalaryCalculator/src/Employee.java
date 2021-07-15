public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30.0;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int workingYears = 2021 - this.hireYear + 1;
        if (workingYears < 10) {
            return this.salary * 0.05;
        } else if (workingYears < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "\n\t" +
                "Name = '" + name + '\'' + "\n\t" +
                "Salary = " + salary + "\n\t" +
                "Weekly working hours = " + workHours + "\n\t" +
                "Year of employment = " + hireYear + "\n\t" +
                "Tax = " + this.tax() + "\n\t" +
                "Bonus = " + this.bonus() + "\n\t" +
                "Salary increase = " + this.raiseSalary() + "\n\t" +
                "Salary with taxes and bonuses = " + (this.salary - this.tax() + this.bonus()) + "\n\t" +
                "Total salary = " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()) + "\n\t" +
                '}';
    }
}
