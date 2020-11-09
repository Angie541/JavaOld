class MedicalFaculty extends Faculties {
    protected int score3;
    protected int score4;
    protected String subject3;
    protected String subject4;

    public MedicalFaculty(String nameAndSurnameOfAStudent, String subject1, int score1, String subject2, int score2,
            String subject3, int score3, String subject4, int score4) {
        super(nameAndSurnameOfAStudent, subject1, score1, subject2, score2);
        this.score3 = score3;
        this.score4 = score4;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    int averageScoreOfAStudentOfMedicalFaculty;

    public int getAverageScoreOfAStudentOfMedicalFaculty() {
        averageScoreOfAStudentOfMedicalFaculty = (score1 + score2 + score3 + score4) / 4;
        return averageScoreOfAStudentOfMedicalFaculty;
    }
}