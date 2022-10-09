package LLD101;

public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    double coins;
    String state;

    public Student(String name,String address,String email){
        this.name = name;
        this.address = address;
        this.email = email;
        this.state = "PAUSED";
    }

    //copy constructor
    public Student(Student other){
        this.name = other.name;
        this.address = other.address;
        this.email = other.email;
        this.psp = other.psp;
        this.state = other.state;
        this.coins = other.coins;
    }

    void changeBatch(String newBatch){
        this.batch = newBatch;
    }

    void pauseCourse(){
        this.state = "PAUSED";
    }
}
