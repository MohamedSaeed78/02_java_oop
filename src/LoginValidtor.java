import java.util.Scanner;

public class LoginValidtor {
    private static LoginValidtor instance = null;
    private String userName;
    private String passWord;
    private LoginValidtor(){}
    public static LoginValidtor getInstance(){
        if (instance == null) {
            instance = new LoginValidtor();
        }
        return instance;
    }
    private void inputFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username:");
        userName = sc.nextLine();
        System.out.print("Enter Password:");
        passWord = sc.nextLine();
    }
     public void validateLogin() {
                //TODO: please rename this variable to a more descriptive name. (done)
                boolean is_User_Login_Info_Not_Valid;
                do {
                        inputFromUser();
                        if (LoginData.getInstance().searchUserInList(userName,passWord)==null){
                                is_User_Login_Info_Not_Valid = true;
                                System.out.println("Invalid username or password!, Please try again.");
                        }else{
                                is_User_Login_Info_Not_Valid = false;
                                //TODO: please rename this variable to a more descriptive name.
                                User user_Validated_Account = LoginData.getInstance().searchUserInList(userName,passWord);
                                if (user_Validated_Account.getUserType()==1){
                                        System.out.println("Login successful!, Mr: "+user_Validated_Account.getUserName()+ " Here is List of Your Students:");
                                        //TODO: try to find away to call this function using object of the class instead of the static solution.
                                    Instructor instructor = (Instructor) user_Validated_Account;
                                        instructor.printInstructorStudents();
                                } else if (user_Validated_Account.getUserType()==2) {
                                        System.out.println("Login successful!, Student: "+user_Validated_Account.getUserName()+ " List of Your Courses:");
                                        //TODO: try to find away to call this function using object of the class instead of the static solution. (done)
                                    Student student = (Student) user_Validated_Account;
                                        student.printStudentCourses();
                                }
                        }
                }
                while (is_User_Login_Info_Not_Valid);
        }
}
