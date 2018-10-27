import java.util.Calendar;
import java.util.Date;

public class Employee {
    private final FullName name;
    private final Gender gender;
    private final MaritalStatus maritalStatus;
    private final Calendar birthDate;

    public Employee(String firstName, String middleName, String lastName, Gender gender, MaritalStatus maritalStatus,
            Calendar birthDate) {
        this.name = new FullName(firstName, middleName, lastName);
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
    }

    public int getAge() {
        Calendar todaysDate = Calendar.getInstance();
        
        int age = todaysDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if(todaysDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH)) {
            age--;
        }
        return age;
    }

    public boolean isFemale() {
        return gender == Gender.Female;
    }

    public boolean isMale() {
        return gender == Gender.Male;
    }

    public void updateLastName(String lastName) {
        name.updateLastName(lastName);
    }

    public String toString() {
        return name.toString();
    }
}