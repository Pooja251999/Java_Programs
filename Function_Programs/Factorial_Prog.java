package Java_Programs.Function_Programs;

import java.util.Scanner;

public class Factorial_Prog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        System.out.println("Factorial of number = "+fact(num));
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
/*
OUTPUT 1:
Enter a Number:
5
Factorial of number = 120

OUTPUT 2:
Enter a Number:
1
Factorial of number = 1
 */