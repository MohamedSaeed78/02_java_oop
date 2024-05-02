import java.util.ArrayList;

//TODO: since you are applying singleton pattern , no need to make things (variables, methods) static.
//you can use LoginData.getInstance() , for example : LoginData.getInstance().searchUserInList(...). 
//apply this to all functions , variables except instance, getInstance() . 
public class LoginData {
    private static LoginData instance = null;
    private static ArrayList<User> usersList ;
    private static final String[] courses = {
            "Java Programming",
            "Web Development",
            "Data Science",
            "Machine Learning"
    };
    private LoginData(){
        usersList = new ArrayList<>();
    }
    public static LoginData getInstance() {
        if (instance == null) {
            instance = new LoginData();
        }
        return instance;
    }

    //please rename this function
    public boolean isAvailable(Object obj) {
        for (Object objterate : usersList) {
            if (objterate.equals(obj)) {
                return true;
            }
        }
        return false;
    }
    //return user data as user object from usre name and password
    public static User searchUserInList(String uName, String uPassword){
        for (User user:getUsersList()){
            if (user.getUserName().equals(uName) && user.getPassWord().equals(uPassword)){
                return user;
            }
        }
        return null;
    }
    
    public void addUser(User user) {
        if (isAvailable(user)) {
            System.out.println(user.getUserName() + " is already in list.");
        } else {
            usersList.add(user);
            System.out.println(user.getUserName() + " is added succesfully to the list");
        }
    }

    public static ArrayList<User> getUsersList() {
        return usersList;
    }

    public static void getListOfStudentsPrinted() {
        for (User user : usersList) {
            if (user.getUserType() == 2) {
                System.out.println("- "+user.getUserName());
            }
        }
    }

    public static void getCoursesPrinted() {
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}