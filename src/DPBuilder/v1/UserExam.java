package DPBuilder.v1;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;
    public UserExam(UserExamParams params){
        if(params.englishMarks > 100 || params.mathMarks > 100 || params.scienceMarks > 100)
            throw new InvalidParameterException("Marks cant be gt than 100");

        if(params.mathMarks+ params.englishMarks > 150)
            throw new InvalidParameterException("Total cant be gt than 150");

        this.englishMarks = params.englishMarks;
        this.mathMarks = params.mathMarks;
        this.scienceMarks = params.scienceMarks;
        this.name = params.name;
    }

}
