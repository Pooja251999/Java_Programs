package Switch_Programs;
import java.util.Scanner;
public class Switch_Counting_Days_Of_Month {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month in Number : ");
        int month = sc.nextInt();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);
    }
}

/*
OUTPUT 1:
Enter Month in Number :
2
Enter Year :
2024
Number of Days = 29

OUTPUT 2:
Enter Month in Number :
9
Enter Year :
1999
Number of Days = 30
*/