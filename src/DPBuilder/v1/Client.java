package DPBuilder.v1;

public class Client {
    public static void main(String[] args) {
        UserExamParams params = new UserExamParams();
        params.englishMarks = 75;
        params.mathMarks = 60;
        params.scienceMarks = 100;
        UserExam exam = new UserExam(params);
    }
}
