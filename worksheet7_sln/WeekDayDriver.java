import java.util.Calendar;
import java.util.Date;

public class WeekDayDriver {
    public static void main(String[] args) {
        // FullName name = new FullName("Mohamed", "Rasool", "Zaib");
        
        // Calendar birthDate = Calendar.getInstance();
        // birthDate.set(Calendar.DAY_OF_MONTH, 27);
        // birthDate.set(Calendar.MONTH, 3);
        // birthDate.set(Calendar.YEAR, 1983);

        // Employee employee = new Employee("Sarah", null, "Sanders", Gender.Female, MaritalStatus.Married, birthDate);

        // EmployeeRecord record = new EmployeeRecord(employee, 35.50, 35);

        // System.out.println(record.getRate());

        WeekDay day = WeekDay.SATURDAY;

        System.out.println(WeekDay.isWeekDay(day));        
    }
}