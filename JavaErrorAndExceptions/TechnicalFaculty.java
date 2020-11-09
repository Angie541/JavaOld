class TechnicalFaculty extends Faculties {
    protected String subject3;
    protected int score3;
    protected String scope;

    public TechnicalFaculty(String nameAndSurnameOfAStudent, String subject1, int score1, String subject2, int score2,
            String subject3, int score3, String scope) {
        super(nameAndSurnameOfAStudent, subject1, score1, subject2, score2);
        this.subject3 = subject3;
        this.score3 = score3;
        this.scope = scope;
    }

    int averageScoreOfAStudentOfTechnicalFaculty;

    public int getAverageScoreOfAStudentOfTechnicalFaculty() {
        averageScoreOfAStudentOfTechnicalFaculty = (score1 + score2 + score3) / 3;
        return averageScoreOfAStudentOfTechnicalFaculty;
    }
}