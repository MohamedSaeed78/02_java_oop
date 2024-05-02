//TODO: please remove plural s from the class name.
public class Students extends User {

    public Students(String stuName, String stuPass, int stuType) {
        super(stuName, stuPass, stuType);
    }
    
    //please avoid using the static identifier it causes memory leaks, call the function using object of the class
    public static void printStudentCourses(){
        LoginData.getCoursesPrinted();
    }
}