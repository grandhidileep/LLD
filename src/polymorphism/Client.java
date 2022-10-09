package polymorphism;

import java.util.List;

public class Client {
    public static void main(String[] args){
        User user = new TA();
        //attribute of ta cannot be set since variable is of type parent class

        User student = new Student();
        User mentor = new Mentor();
        List<User> users = List.of(user,student,mentor,new Student(),new Mentor(),new TA());
        changePasswordOfAllUsers(users);
    }

    public static void changePasswordOfAllUsers(List<User> userList){
        for(User user:userList){
            user.changePassword("randomPass");
            if(user instanceof Student)
                user.changePassword("TEstPasssword12345");
            //
        }
    }
}
