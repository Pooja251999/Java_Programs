package Java_Programs.String_Programs;

import java.util.Scanner;

public class Reverse_String1 {
    public static void main(String[] args) {
        //Reverse a String without using any function or using for loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        int n = str.length() - 1;
        System.out.println("Reverse of a String : ");
        for (int i = n; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
/*
OUTPUT 1:
Enter a String :
Pooja
Reverse of a String :
ajooP

OUTPUT 2:
Enter a String :
Java_Class
Reverse of a String :
ssalC_avaJ
 */