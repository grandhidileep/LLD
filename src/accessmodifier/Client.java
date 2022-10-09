package accessmodifier;

public class Client {

    public static void main(String[] args){
        Student student = new Student();
        //student.email - cannot be accessed since its private
        student.name = "Dileep";
    }
}
