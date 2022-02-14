public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maulen", "Omertay", "ST-2102", "Smart Mals");

        Subject sub = new Subject("C++", 83, 5);
        Subject sub1 = new Subject();
        sub1.setName("History");
        sub1.setGrade(49);
        sub1.setCredits(5);

        checkGrade(sub1.getGrade());
    }

    static void checkGrade(int grade){
        if(grade >= 70){
            System.out.println("Scholarship!!!");
        }
        else if (grade < 50){
            System.out.println("Hello letnik");
        }
    }
}
