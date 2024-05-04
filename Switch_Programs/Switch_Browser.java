package Switch_Programs;

import java.util.Locale;
import java.util.Scanner;

public class Switch_Browser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Browser Name : ");
        String browsername=sc.nextLine();
        browsername=browsername.toLowerCase();

        switch (browsername){
            case "chrome":
                System.out.println("Opening Chrome....");
                break;
            case "firefox":
                System.out.println("Opening firefox....");
                break;
            case "edge":
                System.out.println("Opening edge....");
                break;
            default:
                System.out.println("I have no idea which browser is this...");
        }
        sc.close();
    }
}
/*
OUTPUT 1:
Enter Browser Name :
edge
Opening edge....

OUTPUT 2:
Enter Browser Name :
ie
I have no idea which browser is this...

OUTPUT 3:
Enter Browser Name :
cHROME
Opening Chrome....
 */
