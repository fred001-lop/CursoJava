package AccessModifiers;

public class Student {
    //ATRIBUTOSS
    private int grade;

    //CONSTRUCTOR
    public Student(int grade) {
        this.grade = grade;
    }

    //setter
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //METODO
    public boolean isPassed() {
       return grade >= 60;
    }
}



