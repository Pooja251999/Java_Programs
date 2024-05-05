package Java_Programs.Loop_Programs.While_Loop;

import java.util.Scanner;
/*
Write a program to find the factorial value of any number entered through the keyboard.
 */
public class Factorial_Of_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of a Number = "+fact);
        sc.close();
    }
}
/*
OUTPUT 1:
Enter a Number :
5
Factorial of a Number = 120

OUTPUT 2:
Enter a Number :
7
Factorial of a Number = 5040
 */