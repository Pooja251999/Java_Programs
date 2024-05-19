package Java_Programs.String_Programs;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        String reverse_String=sb.reverse().toString();

        System.out.println("Reverse of a String you Entered : "+reverse_String);
    }
}
/*
Enter a String :
POOJA
Reverse of a String you Entered : AJOOP

 */