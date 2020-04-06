package ro.siit;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return t1.getDateOfBirth()-student.getDateOfBirth();
    }
}
