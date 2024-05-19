package Java_Programs.String_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class String_Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1=sc.nextLine();
        System.out.println("Enter second string : ");
        String str2=sc.nextLine();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char charArray1[] = str1.toCharArray();
            char charArray2[] = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean b=Arrays.equals(charArray1,charArray2);
            if(b){
                System.out.println(str1+ " & " +str2+ " are Armstrong");
            }
            else{
                System.out.println(str1+ " & " +str2+ " are not Armstrong");
            }
        }
        else{
            System.out.println(str1+ " & " +str2+ " are not Armstrong");
        }
    }
}
/*
Enter first string :
Care
Enter second string :
Race
care & race are Armstrong

OUTPUT 2:
Enter first string :
SilenT
Enter second string :
LisTeN
silent & listen are Armstrong

OUTPUT 3:
Enter first string :
POOJA
Enter second string :
ROJA
pooja & roja are not Armstrong

OUTPUT 4:
Enter first string :
POOJA
Enter second string :
KAMAL
pooja & kamal are not Armstrong

 */