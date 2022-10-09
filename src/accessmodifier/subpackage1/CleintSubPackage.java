package accessmodifier.subpackage1;

import accessmodifier.Student;

public class CleintSubPackage {
    public static void main(String[] args){
        Student student = new Student();
        //student.batch protected cannot be accessed from subpackage aswell
    }
}
