package Java_Programs.String_Programs;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        String reverse_String=sb.reverse().toString();

        if(str.equalsIgnoreCase(reverse_String)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
/*
OUTPUT 1:
Enter a String :
Madam
String is Palindrome

OUTPUT 2:
Enter a String :
pOOJA
String is not Palindrome

 */