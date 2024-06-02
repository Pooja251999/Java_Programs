package Java_Programs.OOPs_Concept_Programs.Encapsulation_Programs;
public class ICICI_Bank {

    // Private
    // Use Setter and Getter with Condition to secure your data members by methods
    // hide the data members - ecap

    private String name;
    private long bal;

    public ICICI_Bank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal > 0) {
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed!!");
        }

    }
}
