package Java_Programs.String_Programs;

import java.util.Scanner;

public class Remove_Duplicates_String {
        public static void main(String[] args) {
            //Duplicate String - Hello World -> Helowrd
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String : ");
            String str1 = sc.next();
            String str2 = "";
            char c;
            for (int i=0; i< str1.length(); i++){
                c=str1.charAt(i);
                if (str2.indexOf(c)==-1){
                    str2=str2+c;
                }
            }
            System.out.println("String after removing duplicates: "+str2);
    }
}
/*
OUTPUT 1:
Enter a String :
Pooja
String after removing duplicates: Poja

OUTPUT 2:
Enter a String :
jAVA_cLAss
String after removing duplicates: jAV_cLs
 */