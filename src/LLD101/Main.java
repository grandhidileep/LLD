package LLD101;

public class Main {
    public static void main(String[] args){
        Student dileep = new Student("dileep","Scalerverse - HSR","grandhidileep@gmail.com");
        dileep.state = "ACTIVE";
        dileep.batch = "OCT1";
        dileep.psp = 50.5;
        dileep.coins = 500;
        dileep.pauseCourse();
        System.out.println(dileep.name+" course is "+dileep.state);
        //shallow copy
        Student dileepClone = new Student(dileep);
        dileepClone.name = "dileep 2";
        System.out.println("Name "+dileepClone.name);
        System.out.println("Name original "+dileep.name);
    }
}
