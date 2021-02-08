package Part11.Exeptions;

public class Grade {
    private int grade;

    public Grade(int grade) throws IllegalAccessException {
        if (grade < 0 ||grade > 5) {
            throw new IllegalArgumentException("Grade must be between 0 and 5");
        }


        // hello
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

}
