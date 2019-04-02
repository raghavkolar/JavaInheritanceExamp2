package love.programming;



public class MyMain {

   /* We have created two objects, one of the Person class and one of the Student class
    and assigned them to the corresponding variables. We have accessed the age and marks of the Student object
    and changed them. This is possible as they have been declared to be public variables. And then,
    the printDetails() method was invoked on both these objects. Here is the output:*/

    public static void main(String[] args) {

        Person p= new Person("Raghav",30);
        p.printDetails();

        Student s= new Student("Ramesh",30,50);
        s.age=19;
        s.marks=90;
        s.printDetails();
        s.showGrade();



        Student s1= new Student("Rama",35,90);

        /*

        String s1=s1.toString();
        */


        System.out.println("TEST" + s1);

    }

    /*Implict Casting

     */


    /*Person p = new Person("Sai ", 10);
    Student sT= new Student("Sairam",15,40);

    Person pe;

    {
        pe = sT;

        System.out.println(" Content of Pe :" );
    }

    Student s= (Student) p;*/

}


