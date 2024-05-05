package Java_Programs.Loop_Programs.While_Loop;

import java.util.Scanner;

public class Reverse_OF_Number {
   public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int number;
            int reverse = 0;

            System.out.print("Enter the number ");
            number = sc.nextInt();

            int temp = number;
            int remainder = 0;

            while(temp>0)
            {
                remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp /= 10;
            }

            System.out.println("Reverse of " + number + " is " + reverse);
        }

}
/*
OUTPUT:
Enter the number 12345
Reverse of 12345 is 54321
 */