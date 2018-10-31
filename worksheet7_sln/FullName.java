// Worksheet 7, Question 6

public class FullName {
    private final String firstName;
    private final String middleName;
    private String lastName;

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        String fullName = firstName;

        if(middleName != null) {
            fullName += " " + middleName;
        }
        
        fullName += " " + lastName;
        return fullName;
    }
}