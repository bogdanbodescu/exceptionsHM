package ro.siit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRepository {
    private List<Student> studentList= new ArrayList<>();

    public StudentRepository(){

    }

    public void addStudent(Student s) throws IllegalArgumentException {

    if(s.getFirstName().equals("") || s.getLastName().equals(""))
        throw new IllegalArgumentException("Empty values for either first name or last name, or both");

    if(s.getDateOfBirth()<1900 || s.getDateOfBirth()>2002)
        throw new IllegalArgumentException("Date of birth is invalid");


    String g= s.getGender();
    if(!(g.toLowerCase().equals("m") || g.toLowerCase().equals("f") || g.equals("male") || g.equals("female")))
        throw new IllegalArgumentException("Gender is invalid");

    studentList.add(s);
    }

    public void deleteStudent(String id) throws Exception {
        if(id.equals(""))
            throw new IllegalArgumentException("ID is empty");
        Student s1=null;
        for (Student s:studentList
             ) {
            if(s.getId().equals(id))
            {
                s1=s;
                break;
            }

        }
        if(s1==null)
            throw new Exception("Id not found");
        studentList.remove(s1);
    }

    public List<Student> retrieveStudents(String age) throws IllegalArgumentException {
        try {
            int ageN = Integer.parseInt(age);
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("age not a number!");
        }
        if(Integer.parseInt(age)<0)
            throw new IllegalArgumentException("Age incorrect. It's lower than 0");
        List<Student> sl=new ArrayList<>();

        for(Student s:studentList)
        {
            if((2020-s.getDateOfBirth())==Integer.parseInt(age))
                sl.add(s);
        }
        if(sl==null)
            throw new IllegalArgumentException("Age not found in the List. Try again.");
        return sl;

    }

    public List<Student> retrieveOrderedList(String s) throws IllegalArgumentException{
        if(s.equals(""))
            throw new IllegalArgumentException("Argument is empty");
        List<Student> ls=new ArrayList<>();
        ls.addAll(studentList);
        if(s.equals("lastName"))
        {
            Collections.sort(ls,new StudentLastNameComparator());
            return ls;
        }

        if(s.equals("dateOfBirth"))
        {
            Collections.sort(ls,new StudentAgeComparator());
            return ls;
        }

        throw new IllegalArgumentException("Wrong function argument argument");
    }

    public List<Student> getStudentList(){
        List<Student> ls = new ArrayList<>();
        ls.addAll(studentList);
        return ls;
    }

}
