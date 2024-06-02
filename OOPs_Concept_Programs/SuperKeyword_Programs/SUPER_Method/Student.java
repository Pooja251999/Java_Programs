package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Method;

public class Student extends Person{
    void message(){
        System.out.println("Student's message ....");
    }
    void display(){
        super.message();
        this.message();
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
/*
OUTPUT :

Person's Message ...
Student's message ....

 */
