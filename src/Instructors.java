public class Instructors extends User {
    public Instructors(String instName, String passWord, int instType) {
        super(instName, passWord, instType);
    }

    public static void  printInstructorStudents() {
        LoginData.getListOfStudentsPrinted();
    }

}