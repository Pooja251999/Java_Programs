package Java_Programs.OOPs_Concept_Programs.Encapsulation_Programs;

public class Main_Bank {
    public static void main(String[] args) {
        ICICI_Bank i = new ICICI_Bank("Pooja", 100);
        System.out.println("Balance : "+i.getBal());
        i.setBal(-100);
            //i.name = "Admin";
            //i.setName("Admin");
        System.out.println(i.getBal());
    }
}
/*
Balance : 100
Not allowed!!
100
 */
