import java.sql.SQLOutput;
import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character--> ");
        char c=sc.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            System.out.println("Entered Character is Vowel..." +c);
        else
            System.out.println("Entered Character is Consonant..." +c);
    }
}

/*
OUTPUT 1:
Enter a character-->
T
Entered Character is Consonant...T

OUTPUT 2:
Enter a character-->
I
Entered Character is Vowel...I

OUTPUT 3:
Enter a character-->
o
Entered Character is Vowel...o

OUTPUT 4:
Enter a character-->
x
Entered Character is Consonant...x

 */
