package DPBuilder.v2;

public class Client {
    public static void main(String[] args) {
        UserExam.UserExamBuilder params = new UserExam.UserExamBuilder();
        params.setEnglishMarks(75);
        params.setMathMarks(60);
        params.setScienceMarks(100);
        UserExam userExam = UserExam.getBuilder()
                                    .setEnglishMarks(75)
                                    .setMathMarks(75)
                                    .setScienceMarks(100)
                                    .build();
    }
}
