package Java_Programs.OOPs_Concept_Programs.Constructor_Programs;

public class Parameterized_Constructor1 {
    String lang;
    Parameterized_Constructor1(String language){
        lang=language;
        System.out.println(lang+ " Programming Language");
    }

    public static void main(String[] args) {
        Parameterized_Constructor1 pc1=new Parameterized_Constructor1("Java");
        Parameterized_Constructor1 pc2=new Parameterized_Constructor1("Python");
        Parameterized_Constructor1 pc3=new Parameterized_Constructor1("C++ ");

    }
}
/*
OUTPUT :

Java Programming Language
Python Programming Language
C++  Programming Language

 */
