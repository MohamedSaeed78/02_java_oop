import java.util.Scanner;

public class LoginMain {

        public static void validateLogin() {
                boolean isInvalid;
                do {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter Username:");
                        String userName = sc.nextLine();
                        System.out.print("Enter Password:");
                        String passWord = sc.nextLine();
                        if (LoginData.searchUserInList(userName,passWord)==null){
                                isInvalid = true;
                                System.out.println("Invalid username or password!, Please try again.");
                        }else{
                                isInvalid = false;
                                User uAcc = LoginData.searchUserInList(userName,passWord);
                                if (uAcc.getUserType()==1){
                                        System.out.println("Login successful!, Mr: "+uAcc.getUserName()+ " Here is List of Your Students:");
                                        Instructors.printInstructorStudents();
                                } else if (uAcc.getUserType()==2) {
                                        System.out.println("Login successful!, Student: "+uAcc.getUserName()+ " List of Your Courses:");
                                        Students.printStudentCourses();
                                }
                        }
                }
                while (isInvalid);
        }
        public static void main(String[] args) {
        Instructors instructor1 = new Instructors("instructor1","instPass1",1);
        Instructors instructor2 = new Instructors("instructor2","instPass2",1);
        Instructors instructor3 = new Instructors("instructor3","instPass3",1);
        Instructors instructor4 = new Instructors("instructor4","instPass4",1);
        Students student1 = new Students("student1","stuPass1",2);
        Students student2 = new Students("student2","stuPass2",2);
        Students student3 = new Students("student3","stuPass3",2);
        Students student4 = new Students("student4","stuPass4",2);
        LoginData loginData = LoginData.getInstance();
        loginData.addUser(instructor1);
        loginData.addUser(instructor2);
        loginData.addUser(instructor2);
        loginData.addUser(instructor3);
        loginData.addUser(instructor4);
        loginData.addUser(student1);
        loginData.addUser(student2);
        loginData.addUser(student2);
        loginData.addUser(student3);
        loginData.addUser(student4);
//        System.out.println( loginData.getUsersList().toString());
        System.out.println("Welcome to the Course Center Application!");
        validateLogin();

    }
}