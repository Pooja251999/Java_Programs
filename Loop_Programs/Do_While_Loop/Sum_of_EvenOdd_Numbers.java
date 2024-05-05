package Java_Programs.Loop_Programs.Do_While_Loop;

import java.util.Scanner;

public class Sum_of_EvenOdd_Numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do
        {
            System.out.print("Enter the number ");
            number = sc.nextInt();

            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
    }
}
/*
OUTPUT:
Enter the number 5
Do you want to continue y/n? y
Enter the number 5
Do you want to continue y/n?
y
Enter the number 6
Do you want to continue y/n? y
Enter the number 6
Do you want to continue y/n? n
Sum of even numbers: 12
Sum of odd numbers: 10
 */