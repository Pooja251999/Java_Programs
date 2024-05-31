package Java_Programs.Constructor_Programs;

public class Default_Constructor2 {
    String name;

    Default_Constructor2(){
        System.out.println("Assigning value to name variable...");
        name="Constructor";
    }

    public static void main(String[] args) {
        Default_Constructor2 dc2=new Default_Constructor2();
        System.out.println("Name Assigned from Default Constructor= " +dc2.name);
    }
}
/*
OUTPUT:

Assigning value to name variable...
Name Assigned from Default Constructor= Constructor
 */