package polymorphism;

import java.util.List;

public class Mentor extends User{
    String company;
    List<String> skills;
    List<Student> mentees;
    public void changePassword(String newPassword){
        System.out.println("Changing Emial in Mentor");
        this.password = newPassword;
    }
}
