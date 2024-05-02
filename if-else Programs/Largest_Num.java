import java.sql.SQLOutput;
import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2= sc.nextInt();
        System.out.println("Enter Third Number : ");
        int num3= sc.nextInt();

        if(num1>=num2 && num1>=num3)
            System.out.println("Largest Number is : "+num1);

        else if(num2>=num1 && num2>=num3)
            System.out.println("Largest Number is : "+num2);

        else
            System.out.println("Largest Number is : "+num3);


    }
}

/*
Output 1:
Enter First Number :
10
Enter Second Number :
4
Enter Third Number :
200
Largest Number is : 200

Output 2:
Enter First Number :
4000
Enter Second Number :
-5833
Enter Third Number :
198
Largest Number is : 4000

Output 3:
Enter First Number :
85
Enter Second Number :
85
Enter Third Number :
84
Largest Number is : 85

Output 4:
Enter First Number :
73
Enter Second Number :
67
Enter Third Number :
85
Largest Number is : 85

 */