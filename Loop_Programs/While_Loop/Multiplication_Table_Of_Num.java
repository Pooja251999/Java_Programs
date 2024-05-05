package Java_Programs.Loop_Programs.While_Loop;

import java.util.Scanner;

public class Multiplication_Table_Of_Num {
    //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int i=1;
        System.out.println("Multiplication Table of "+n);
        while(i<=10)
        {
            //multi=i*n;
            System.out.println(" "+i+"*"+" "+n+" = "+(i*n));
            i++;
        }
        sc.close();
    }

}
/*
OUTPUT:
Enter a number :
5
Multiplication Table of 5
 1* 5 = 5
 2* 5 = 10
 3* 5 = 15
 4* 5 = 20
 5* 5 = 25
 6* 5 = 30
 7* 5 = 35
 8* 5 = 40
 9* 5 = 45
 10* 5 = 50
 */