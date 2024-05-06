//TODO: please remove plural s from the class name. (done)
public class Instructor extends User {
    public Instructor(String instName, String passWord, int instType) {
        super(instName, passWord, instType);
    }

    //TODO: please avoid using the static identifier it causes memory leaks, call the function using object of the class. (done)
    public void printInstructorStudents() {
        LoginData.getInstance().getListOfStudentsPrinted();
    }

}