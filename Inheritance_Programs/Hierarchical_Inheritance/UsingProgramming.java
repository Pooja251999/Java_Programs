package Java_Programs.Inheritance_Programs.Hierarchical_Inheritance;
public class UsingProgramming {
    public static void main(String[] args) {
        Programming pr=new Programming("James Gosling", 11.0f);
        Java_Programming j1=new Java_Programming("Collections");
        pr.printInfo();
        j1.printInfo();

        System.out.println();

        Programming pr1=new Programming("Guido van Rossum", 5.0f);
        pr1.printInfo();
        Python_Programming p1=new Python_Programming("Dynamic Semantics");
        p1.printInfo();

        System.out.println();

        Programming pr2=new Programming("Dennis Ritchie", 3.0f);
        pr2.printInfo();
        C_Programming p2=new C_Programming("Pointers");
        p2.printInfo();
    }
}
/*
OUTPUT:
Author : James Gosling   ||  Version : 11.0
New Features : Collections

Author : Guido van Rossum   ||  Version : 5.0
New Features : Dynamic Semantics

Author : Dennis Ritchie   ||  Version : 3.0
New Features : Pointers
 */