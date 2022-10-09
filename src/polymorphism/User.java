package polymorphism;

public class User {
    String name;
    String email;
    String password;
    public void changePassword(String newPassword){
        System.out.println("Changing Emial in User");
        this.password = newPassword;
    }
}
