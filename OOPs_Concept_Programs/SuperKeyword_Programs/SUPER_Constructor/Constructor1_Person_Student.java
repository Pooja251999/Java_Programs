package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Constructor;
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

public class Constructor1_Person_Student {
    public static void main(String[] args) {
        Student std=new Student();
    }

}

/*
OUTPUT :
Person DC ...
Student DC ...
 */