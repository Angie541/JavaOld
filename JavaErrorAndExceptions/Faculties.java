import java.util.*;

class Faculties {
    protected String nameAndSurnameOfAStudent;
    protected String subject1;
    protected int score1;
    protected String subject2;
    protected int score2;

    public Faculties(String nameAndSurnameOfAStudent, String subject1, int score1, String subject2, int score2) {
        this.nameAndSurnameOfAStudent = nameAndSurnameOfAStudent;
        this.subject1 = subject1;
        this.score1 = score1;
        this.subject2 = subject2;
        this.score2 = score2;
    }

    public String getNameAndSurnameOfAStudent() {
        return nameAndSurnameOfAStudent;
    }

    public int getScore1() {
        return score1;
    }

    public String getSubject1() {
        return subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public int getScore2() {
        return score2;
    }
}