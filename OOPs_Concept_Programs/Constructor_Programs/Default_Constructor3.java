package Java_Programs.OOPs_Concept_Programs.Constructor_Programs;

public class Default_Constructor3 {
    int var;
    private Default_Constructor3(){
        System.out.println("Assigning value to variable from Private DC...");
        var=10;
    }

    public static void main(String[] args) {
        Default_Constructor3 dc3=new Default_Constructor3();
        System.out.println("Value Assigned : "+dc3.var);
    }
}
/*
OUTPUT :

Assigning value to variable from Private DC...
Value Assigned : 10
 */
