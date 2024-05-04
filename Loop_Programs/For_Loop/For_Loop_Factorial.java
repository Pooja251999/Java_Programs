package Java_Programs.Loop_Programs.For_Loop;

import java.util.Scanner;

public class For_Loop_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
           fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
}

/*
OUTPUT :
Enter number :
5
Factorial = 120
 */
