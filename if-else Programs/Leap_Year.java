import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year__");
        int year=sc.nextInt();

        if(year%4==0)
            System.out.println(year+ " is a Leap year :)");
        else
            System.out.println(year+ " is not a Leap year");
    }
}

/*
Output 1:
Enter a Year__
2014
2014 is not a Leap year :)

Output 2:
Enter a Year__
2024
2024 is a Leap year :)
 */