package Java_Programs.OOPs_Concept_Programs.Constructor_Programs.SuperKeyword_Programs.SUPER_Constructor;

public class Constructo1_Person_Student {
    public static void main(String[] args) {
        Student std=new Student();
    }

}
class Person{
    Person(){
        System.out.println("Person DC ...");
    }
}
class Student extends Person{
    Student(){
        System.out.println("Student DC ...");
    }
}
/*
OUTPUT :
Person DC ...
Student DC ...
 */