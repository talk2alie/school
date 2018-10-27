import java.util.Calendar;
import java.util.Date;

public class WeekDayDriver {
    public static void main(String[] args) {
        FullName name = new FullName("Mohamed", "Rasool", "Zaib");
        
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(Calendar.DAY_OF_MONTH, 27);
        birthDate.set(Calendar.MONTH, 3);
        birthDate.set(Calendar.YEAR, 1983);

        Employee employee = new Employee("Sarah", null, "Sanders", Gender.Female, MaritalStatus.Married, birthDate);

        int age = employee.getAge();

        System.out.println(employee);
        System.out.println("Age: " + age);
        System.out.println("Is Female: " + employee.isFemale());
        System.out.println("Is Male: " + employee.isMale());        
    }
}