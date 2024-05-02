//TODO: please remove plural s from the class name.
public class Instructors extends User {
    public Instructors(String instName, String passWord, int instType) {
        super(instName, passWord, instType);
    }

    //TODO: please avoid using the static identifier it causes memory leaks, call the function using object of the class
    public static void  printInstructorStudents() {
        LoginData.getListOfStudentsPrinted();
    }

}