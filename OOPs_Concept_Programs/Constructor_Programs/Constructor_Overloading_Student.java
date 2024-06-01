package Java_Programs.OOPs_Concept_Programs.Constructor_Programs;

public class Constructor_Overloading_Student {

    String name;
    int ID;
    float fees;
    String course_name;

    Constructor_Overloading_Student(){
        name="Amit";
        ID=12345;
        fees=13000;
        course_name="C Programming";
        System.out.println("Default Constructor ...");
        System.out.println("Name    : "+name);
        System.out.println("ID      : "+ID);
        System.out.println("Fees    : "+fees);
        System.out.println("Course  : "+course_name);
    }
    Constructor_Overloading_Student(String name1, int ID1, float fees1, String course_name1){
        this.name=name1;
        this.ID=ID1;
        this.fees=fees1;
        this.course_name=course_name1;
        System.out.println("Paramaterized Constructor1 ...");
        System.out.println("Name    : "+name);
        System.out.println("ID      : "+ID);
        System.out.println("Fees    : "+fees);
        System.out.println("Course  : "+course_name);
    }
    Constructor_Overloading_Student(int ID2, float fees2, String course_name2){
        this.ID=ID2;
        this.fees=fees2;
        this.course_name=course_name2;
        System.out.println("Paramaterized Constructor2 ...");
        System.out.println("ID      : "+this.ID);
        System.out.println("Fees    : "+this.fees);
        System.out.println("Course  : "+this.course_name);
    }
    public static void main(String[] args) {
        System.out.println("***** Student Details *****");
        Constructor_Overloading_Student stud1=new Constructor_Overloading_Student();
        System.out.println();
        Constructor_Overloading_Student stud2=new Constructor_Overloading_Student("Rajesh", 90876,15600,"Java Programming");
        System.out.println();
        Constructor_Overloading_Student stud3=new Constructor_Overloading_Student( 76542,12000,"Python Programming");

    }
}
/*
***** Student Details *****
Default Constructor ...
Name    : Amit
ID      : 12345
Fees    : 13000.0
Course  : C Programming

Paramaterized Constructor1 ...
Name    : Rajesh
ID      : 90876
Fees    : 15600.0
Course  : Java Programming

Paramaterized Constructor2 ...
ID      : 76542
Fees    : 12000.0
Course  : Python Programming
 */