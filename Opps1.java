//First Lecture Oops in java
//Classes, Objects, Constructors, New & this Keyword
class Student1 {
    int roll;
    String name;
    float marks;

    public void greeting() {
        System.out.println("Hello this is " + name);
    }

//    Student() { // Constructor Overloading
//        this.name = "Rajeev Ranjan";
//        this.roll = 78;
//        this.marks = 89.9f;
//    }

    Student1() {
//        this is how we call a constructor from another constructor
//        internally this is like new Student(12 , "default person" , 100.0f);
        this(12, "default person", 100.0f);
    }


    //Student rahul = new Student();
    //then this keyword will replace by the rahul it will like what
    //rahul.name, rahul.roll, rahul.marks
    Student1(int rollnumber, String naam, float markskitneaayehain) { //Constructor Overloading
        this.name = naam; // this.name will treat compiler by rajeev.name and same as further variables
        this.roll = rollnumber;
        this.marks = markskitneaayehain;
    }

    Student1(Student1 other) {
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }
}

public class Opps1 {
    public static void main(String[] args) {
        Student1 rajeev = new Student1();
//        Student priya = new Student(75 , "Priya Yadav" , 88);
        Student1 other = new Student1(rajeev);

        Student1 defultname = new Student1();
        System.out.println(defultname.name);

//        System.out.println(other.roll);
//        System.out.println(other.name);
//        System.out.println(other.marks);


//        System.out.println(rajeev.roll);
//        System.out.println(rajeev.name);
//        System.out.println(rajeev.marks);
    }

}
