package Switch_Programs;

public class Switch_MultiCase {
    public static void main(String[] args) {
        int itemcode = 005;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is an electronic gadget....");
                break;
            case 004, 005, 006:
                System.out.println("It is not a electronic gadget....");
                break;
            default:
                System.out.println("Wrong code entered...");
        }
    }
}

/*
OUTPUT 1:
It is not a electronic gadget....
 */