import java.util.Scanner;

public class Positive_Negative_Num
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if (num>0)
            System.out.println("You entered Positive number..."+num);
        else if(num<0)
            System.out.println("You entered Negative number..."+num);
        else
            System.out.println("You entered Zero..."+num);

    sc.close();
    }
}

/*
Output 1:
Enter a number:
10
You entered Positive number...10

Output 2:
Enter a number:
0
You entered Zero...0

Output 3:
Enter a number:
-100
You entered Negative number...-100

Output 4:
Enter a number:
00
You entered Zero...0

 */