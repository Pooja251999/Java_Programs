package Java_Programs.Loop_Programs.Do_While_Loop;

import java.util.Scanner;

public class Sum_OF_2Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        int sum=0;
        char ch;
        do{
            System.out.println("Enter value of Number 1 : ");
            num1=sc.nextInt();

            System.out.println("Enter value of Number 2 :");
            num2=sc.nextInt();

            sum=num1+num2;
            System.out.println("Sum of 2 Numbers = " +sum);

            System.out.println("Do you want to continue the operation y/n : ");
            ch=sc.next().charAt(0);

        }while(ch=='y' || ch=='Y');

        sc.close();
    }
}
/*
OUTPUT:
Enter value of Number 1 :
5
Enter value of Number 2 :
6
Sum of 2 Numbers = 11
Do you want to continue the operation y/n :
y
Enter value of Number 1 :
100
Enter value of Number 2 :
55
Sum of 2 Numbers = 155
Do you want to continue the operation y/n :
t
 */