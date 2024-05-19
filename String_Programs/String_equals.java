package Java_Programs.String_Programs;
import java.util.Scanner;
public class String_equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1=sc.nextLine();
        System.out.println("Enter second String : ");
        String str2=sc.nextLine();
        boolean b= str1.equals(str2);
        if(b){
            System.out.println("Both the Strings are equal...");
        }
        else {
            System.out.println("Both the Strings are not equal");
        }
       // System.out.println("Both the Strings are equal= "+b);

    }
}
/*
OUTPUT 1:
Enter first String :
pooja
Enter second String :
roja
Both the Strings are not equal

OUTPUT 2:
Enter first String :
Rama
Enter second String :
Rama
Both the Strings are equal...

 */