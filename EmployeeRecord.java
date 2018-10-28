import java.util.Calendar;

public class EmployeeRecord {
    private final Employee employee;
    private final double payRate;
    private int hoursWorked;

    public EmployeeRecord(Employee employee, double payRate, int hoursWorked) {
        this.employee = employee;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public EmployeeRecord(String firstName, String middleName, String lastName, Gender gender,
            MaritalStatus maritalStatus, Calendar birthDate, double payRate, int hoursWorked) {
        employee = new Employee(firstName, middleName, lastName, gender, maritalStatus, birthDate);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return payRate;
    }

    public void updateHoursWroked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}