package DPBuilder.v2;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;
    private UserExam(UserExamBuilder params){
        this.englishMarks = params.englishMarks;
        this.mathMarks = params.mathMarks;
        this.scienceMarks = params.scienceMarks;
        this.name = params.name;
    }

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks;
        private int mathMarks;
        private int scienceMarks;
        private String name;

        public int getEnglishMarks() {
            return englishMarks;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public int getMathMarks() {
            return mathMarks;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public int getScienceMarks() {
            return scienceMarks;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build(){
            if(englishMarks > 100 || mathMarks > 100 || scienceMarks > 100)
                throw new InvalidParameterException("Marks cant be gt than 100");

            if(mathMarks+ englishMarks > 150)
                throw new InvalidParameterException("Total cant be gt than 150");

            if(name.startsWith("0"))
                throw new InvalidParameterException("Invalid name");
            UserExam userExam = new UserExam(this);
            return userExam;
        }
    }


}
