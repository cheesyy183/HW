package task_2;

public class Employee {
    private String employeeID;
    private int salary;
    private String name;

    public static void main(String[] args) {
        Manager[] employees = { new SalariedEmployee("Bohdan", "123", 15000),
                                 new ContractEmployee("Vasia", "456", 100, 160),
                                 new SalariedEmployee("Olga", "236", 12000),
                                 new ContractEmployee("Natalia", "741", 150, 155)};
        // calculate salary of each employee's
        for(Manager i : employees) {
            i.calculatePay();
        }
        // sort workers by descending the average monthly wage

        for (int i = 0; i < employees.length; i++) {
            Manager max = employees[i];
            int max_position = i;

            for (int j = i + 1; j < employees.length; j++) {
                if (max.equals(employees[j])) {
                    max = employees[j];
                    max_position = j;
                }
            }

            Manager temp = employees[i];
            employees[i] = max;
            employees[max_position] = temp;
        }
        // output sorted workers by overrided method toString()
        for (Manager o: employees) {
            System.out.println(o);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public boolean equals(Object o) { // return true if salary other employee  > salary this employee's
        Employee employee = (Employee) o;

        return employee.salary > this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + this.employeeID + '\'' +
                ", salary=" + this.salary +
                ", name='" + this.name + '\'' +
                '}';
    }
}

interface Manager {
    void calculatePay();
}

class SalariedEmployee extends Employee implements Manager{
    private final int fixedPayment;

    public SalariedEmployee(String name, String employeeID, int fixedPayment) {
        this.fixedPayment = fixedPayment;
        setName(name);
        setEmployeeID(employeeID);
    }

    public void calculatePay() {
        setSalary(this.fixedPayment);
    }
}

class ContractEmployee extends Employee implements Manager{
    private final int hourlyRate;
    private final int numberOfHoursWorked;

    public ContractEmployee(String name, String employeeID, int hourlyRate, int numberOfHoursWorked) {
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;

        setName(name);
        setEmployeeID(employeeID);
    }

    public void calculatePay() {
        setSalary(this.hourlyRate * this.numberOfHoursWorked);
    }
}
