package love.programming;

public class Student extends Person {

    int marks;

    public Student(String nam, int ag, int m){

        super(nam, ag);
        this.marks=m;
    }


    public void m() {
        name=null;
        age=-1;
        printDetails();
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Marks: " + marks);
    }

    public void showGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
    }

    public String toString() {

        String s1=("Student: "+this.name+" "+this.age+" "+this.marks);
        return s1;
    }

}
