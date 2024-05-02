public class User {
    private final String userName;
    private final String passWord;
    private final int userType;

    public User(String userName, String passWord, int userType) {
        this.userName = userName;
        this.passWord = passWord;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getUserType() {
        return userType;
    }

}