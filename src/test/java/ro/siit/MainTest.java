package ro.siit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Unit test for simple App.
 */
public class MainTest
{

    static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void addStudentTests()
    {
        StudentRepository sr = new StudentRepository();
        Student a1 = new Student("Tom", "Andrei","m","1234",1990);
        Student a2 = new Student("Q", "Andreea","female","12345",2002);
        Student a3= new Student("Popescu", "Ion","male","123456",2002);
        Student a4 = new Student("Ionescu", "Alex","M","1234567",1991);
        Student a5 = new Student("Vulpe", "Cris","F","12345678",1991);
        Student a6 = new Student("Afrim", "Miruna","f","123456789",1991);
        Student a7 = new Student("Popp", "Stefania","fe","1234567890",1980);
        Student a8 = new Student("Chiru", "Ana","f","12341",1890);
        Student a9 = new Student("", "George","m","123412",-1990);
        Student a10 = new Student("Mich", "","m","1234123",1990);
        Student a11 = new Student("", "","m","12341231211",1999);
        Student a12 = new Student("S", "A","m","1234123121221",2003);


        try{
            sr.addStudent(a1);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a1);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a1);
        }

        try{
            sr.addStudent(a2);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a2);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a2);
        }

        try{
            sr.addStudent(a3);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a3);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a3);
        }

        try{
            sr.addStudent(a4);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a4);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a4);
        }

        try{
            sr.addStudent(a5);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a5);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a5);
        }

        try{
            sr.addStudent(a6);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a6);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a6);
        }

        try{
            sr.addStudent(a7);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a7);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a7);
        }

        try{
            sr.addStudent(a8);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a8);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a8);
        }

        try{
            sr.addStudent(a9);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a9);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a9);
        }

        try{
            sr.addStudent(a10);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a10);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a10);
        }

        try{
            sr.addStudent(a11);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a11);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a11);
        }

        try{
            sr.addStudent(a12);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(a12);
            System.out.println();
            logger.log(Level.ERROR, "Cannot add this student because it does not respect the constraints: " + a12);
        }

    }

    @Test
    public void deleteStudentTests(){
        StudentRepository sr = new StudentRepository();
        Student a1 = new Student("Tom", "Andrei","m","1234",1990);
        Student a2 = new Student("Q", "Andreea","female","12345",2002);
        Student a3= new Student("Popescu", "Ion","male","123456",2002);
        Student a4 = new Student("Ionescu", "Alex","M","1234567",1991);
        Student a5 = new Student("Vulpe", "Cris","F","12345678",1991);
        sr.addStudent(a1);
        sr.addStudent(a2);
        sr.addStudent(a3);
        sr.addStudent(a4);
        sr.addStudent(a5);

        try{
            sr.deleteStudent(""); //Invalid
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, "Cannot delete student because empty name");
        }


        try{
            sr.deleteStudent("1"); //Nu exista in lista
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, "Cannot delete student because given id does not match any in the existing file");
        }

        try{
            sr.deleteStudent("12345"); //Am sters pe Q Andreaa
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, "Cannot delete student because given id does not match any in the existing file");
        }

        //Am sters doar pe Q Andreea
        for (Student s:sr.getStudentList()
             ) {
            System.out.println(s);
            System.out.println();
        }
    }

    @Test
    public void retrieveStudentsTest(){
            StudentRepository sr = new StudentRepository();
            Student a1 = new Student("Tom", "Andrei","m","1234",1990);
            Student a2 = new Student("Q", "Andreea","female","12345",2002);
            Student a3= new Student("Popescu", "Ion","male","123456",2002);
            Student a4 = new Student("Ionescu", "Alex","M","1234567",1991);
            Student a5 = new Student("Vulpe", "Cris","F","12345678",1991);
            Student a6 = new Student("Afrim", "Miruna","f","123456789",1991);

            sr.addStudent(a1);
            sr.addStudent(a2);
            sr.addStudent(a3);
            sr.addStudent(a4);
            sr.addStudent(a5);
            sr.addStudent(a6);
            try{
               sr.retrieveStudents("ndandas");
            }
            catch (Exception e){
                System.out.println(e);
                logger.log(Level.ERROR, e);
            }

        try{
            sr.retrieveStudents("-10");
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, e);
        }


        try{
            System.out.println(sr.retrieveStudents("29"));
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, e);
            }
    }

    @Test
    public void retrieveOrderedListTests(){
        StudentRepository sr = new StudentRepository();
        Student a1 = new Student("Tom", "Andrei","m","1234",1990);
        Student a2 = new Student("Q", "Andreea","female","12345",2002);
        Student a3= new Student("Popescu", "Ion","male","123456",2002);
        Student a4 = new Student("Ionescu", "Alex","M","1234567",1991);
        Student a5 = new Student("Vulpe", "Cris","F","12345678",1991);
        Student a6 = new Student("Afrim", "Miruna","f","123456789",1991);

        sr.addStudent(a1);
        sr.addStudent(a2);
        sr.addStudent(a3);
        sr.addStudent(a4);
        sr.addStudent(a5);
        sr.addStudent(a6);

        try{
            sr.retrieveOrderedList("");
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, e);
        }

        try{
            List<Student> s =sr.retrieveOrderedList("lastName");
            for (Student ss:s
                 ) {
                System.out.println(ss);
                System.out.println();

            }
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, e);
        }

        System.out.println("_______________________________________________");
        try{
            List<Student> s =sr.retrieveOrderedList("dateOfBirth");
            for (Student ss:s
            ) {
                System.out.println(ss);
                System.out.println();

            }
        }
        catch (Exception e){
            System.out.println(e);
            logger.log(Level.ERROR, e);
        }

    }
}
