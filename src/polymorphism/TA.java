package polymorphism;

public class TA  extends User{
    String expertise;
    String company;

    public void changePassword(String newPassword){
        System.out.println("Changing Emial in TA");
        this.password = newPassword;
    }
}
