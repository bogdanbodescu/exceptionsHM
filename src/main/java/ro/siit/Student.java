package ro.siit;

public class Student {
    private String lastName, firstName, gender, id;
    private int dateOfBirth;

    public Student(String lastName, String firstName, String gender, String id, int dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student named: " + this.lastName + " " + this.firstName + ", who is a " + this.gender + ", and was born on " + this.dateOfBirth + ", has the following ID: " + this.id;
    }
}
