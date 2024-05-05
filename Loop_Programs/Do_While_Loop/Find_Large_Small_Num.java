package Java_Programs.Loop_Programs.Do_While_Loop;

import java.util.Scanner;
/*
Write a program to enter the numbers till the user wants and
at the end the program should display the largest and smallest numbers entered.
 */
public class Find_Large_Small_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int large=0, small=0, num=0;
        char ch;
        do{
            System.out.println("Enter a Number : ");
            num=sc.nextInt();
            if(num>large){
                large=num;
            }
            else{
                small=num;
            }
            System.out.println("Do you want to continue the operation y/n : ");
            ch=sc.next().charAt(0);

        }while (ch=='y'||ch=='Y');
        System.out.println("Largest Number  = "+large);
        System.out.println("Smallest Number = "+small);
        sc.close();

    }
}
/*
OUTPUT :
Enter a Number :
10
Do you want to continue the operation y/n :
y
Enter a Number :
16
Do you want to continue the operation y/n :
y
Enter a Number :
4
Do you want to continue the operation y/n :
y
Enter a Number :
100
Do you want to continue the operation y/n :
y
Enter a Number :
-5
Do you want to continue the operation y/n :
y
Enter a Number :
500
Do you want to continue the operation y/n :
n
Largest Number  = 500
Smallest Number = -5
 */