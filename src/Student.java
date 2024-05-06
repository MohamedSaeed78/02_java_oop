//TODO: please remove plural s from the class name. (done)
public class Student extends User {

    public Student(String stuName, String stuPass, int stuType) {
        super(stuName, stuPass, stuType);
    }

    //please avoid using the static identifier it causes memory leaks, call the function using object of the class. (done)
    public void printStudentCourses(){
        LoginData.getInstance().getCoursesPrinted();
    }
}