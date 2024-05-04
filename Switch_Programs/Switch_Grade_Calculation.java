package Switch_Programs;

import java.util.Scanner;

public class Switch_Grade_Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks= sc.nextInt();
        marks=marks/10;
        switch (marks){
            case 9:
                System.out.println("Grade is A " );
                break;
            case 8:
                System.out.println("Grade is B " );
                break;
            case 7:
                System.out.println("Grade is C " );
                break;
            case 6,5,4,3,2,1:
                System.out.println("FAIL..." );
                break;
            default:
                System.out.println("None...");
        }
        sc.close();
    }
}
/*
OUTPUT 1:
Enter Marks :
97
Grade is A

OUTPUT 2:
Enter Marks :
55
FAIL...

OUTPUT 3:
Enter Marks :
5
None...
 */