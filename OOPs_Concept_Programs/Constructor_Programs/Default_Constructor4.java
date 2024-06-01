package Java_Programs.OOPs_Concept_Programs.Constructor_Programs;

public class Default_Constructor4 {
    String company_name;
    public Default_Constructor4(){
        System.out.println("Assigning value to variable from Public DC...");
        company_name="Amazon";
    }

    public static void main(String[] args) {
        Default_Constructor4 dc4=new Default_Constructor4();
        System.out.println("Company Name Assigned : "+dc4.company_name);
    }
}
/*
OUTPUT:

Assigning value to variable from Public DC...
Company Name Assigned : Amazon

 */