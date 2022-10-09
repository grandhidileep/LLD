package polymorphism;

import inhertence.Mentor;

public class Student extends User{
    private double psp;
    private Mentor mentor;
    private String batch;

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void changeBatch(String newBatch){
        this.batch = newBatch;
    }

    public void changePassword(String newPassword){
        System.out.println("Changing Emial in Student");
        this.password = newPassword;
    }
}
