public class LoginMain {
  
        //TODO: please Create a class like "LoginValidator" and add this method to it , don't make it static.. (done)
        //TODO: please use loops . (done)
        public static void main(String[] args) {
                //loop for creating test users objects.
                for (int i = 1; i <= 4; i++) {
                        LoginData.getInstance().addUser(new Instructor("instructor"+i,"instPass"+i,1));
                        LoginData.getInstance().addUser(new Student("student"+i,"stuPass"+i,2));
                }
        System.out.println("Welcome to the Course Center Application!");
        LoginValidtor.getInstance().validateLogin();

    }
}