import java.util.ArrayList;

//TODO: since you are applying singleton pattern , no need to make things (variables, methods) static.
//you can use LoginData.getInstance() , for example : LoginData.getInstance().searchUserInList(...). 
//apply this to all functions , variables except instance, getInstance() . (done)
public class LoginData {
    private static LoginData instance = null;
    private ArrayList<User> usersList ;
    private final String[] courses = {
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

    //please rename this function (done)
    public boolean isUserAvailable(Object obj) {
        for (Object objterate : usersList) {
            if (objterate.equals(obj)) {
                return true;
            }
        }
        return false;
    }
    //return user data as user object from user name and password
    public User searchUserInList(String uName, String uPassword){
        for (User user:getUsersList()){
            if (user.getUserName().equals(uName) && user.getPassWord().equals(uPassword)){
                return user;
            }
        }
        return null;
    }
    
    public void addUser(User user) {
        if (isUserAvailable(user)) {
            System.out.println(user.getUserName() + " is already in list.");
        } else {
            usersList.add(user);
            System.out.println(user.getUserName() + " is added succesfully to the list");
        }
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void getListOfStudentsPrinted() {
        for (User user : usersList) {
            if (user.getUserType() == 2) {
                System.out.println("- "+user.getUserName());
            }
        }
    }

    public void getCoursesPrinted() {
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}