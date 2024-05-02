public class Students extends User {

    public Students(String stuName, String stuPass, int stuType) {
        super(stuName, stuPass, stuType);
    }
    public static void printStudentCourses(){
        LoginData.getCoursesPrinted();
    }
}