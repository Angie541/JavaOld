class LawFaculty extends Faculties {
    protected int id;

    public LawFaculty(String nameAndSurnameOfAStudent, String subject1, int score1, String subject2, int score2,
            int id) {
        super(nameAndSurnameOfAStudent, subject1, score1, subject2, score2);
        this.id = id;
    }

    int averageScoreOfAStudentOfLawFaculty;

    public int getAverageScoreOfAStudentOfLawFaculty() {
        averageScoreOfAStudentOfLawFaculty = (score1 + score2) / 2;
        return averageScoreOfAStudentOfLawFaculty;
    }
}