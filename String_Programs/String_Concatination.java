package Java_Programs.String_Programs;

import java.util.Scanner;

public class String_Concatination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1=sc.nextLine();
        System.out.println("Enter second String : ");
        String str2=sc.nextLine();
        String concat_str=str1.concat(str2);
        System.out.println("Concatination of String : "+concat_str);
    }
}
/*
OUTPUT 1:
Enter first String :
pooja
Enter second String :
1234
Concatination of String : pooja1234
 */