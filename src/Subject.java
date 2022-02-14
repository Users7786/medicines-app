public class Subject {
    String name;
    int grade, credits;

    public Subject() {}

    public Subject(String name, int grade, int credits) {
        this.name = name;
        this.grade = grade;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
