package Java_Programs.Loop_Programs.Do_While_Loop;

import java.util.Scanner;
/*
Write a program to enter the numbers till the user wants
and at the end it should display the count of positive, negative and zeros entered.
 */
public class Count_POS_NEG_ZERO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        int num=0;
        char ch;

        do{
            System.out.println("Enter a Number : ");
            num=sc.nextInt();
            if(num>0)
                pos++;
            else if (num<0)
                neg++;
            else
                zero++;

            System.out.println("Do you want to continue y/n : ");
            ch=sc.next().charAt(0);
        }while (ch=='y' || ch=='Y');

        System.out.println("Count of Positive Numbers = "+pos);
        System.out.println("Count of Negative Numbers = "+neg);
        System.out.println("Count of Zero's           = "+zero);
        sc.close();
    }
}
/*
OUTPUT :
Enter a Number :
7
Do you want to continue y/n :
y
Enter a Number :
-10
Do you want to continue y/n :
y
Enter a Number :
0
Do you want to continue y/n :
y
Enter a Number :
32
Do you want to continue y/n :
y
Enter a Number :
0
Do you want to continue y/n :
y
Enter a Number :
-34
Do you want to continue y/n :
n
Count of Positive Numbers = 2
Count of Negative Numbers = 2
Count of Zero's           = 2
 */