package Switch_Programs;

import java.util.Scanner;

public class Switch_Arithmatic_Operations {
    public static void main(String[] args) {
        //Program to Perform Arithmetic Operations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        float num1=sc.nextFloat();
        System.out.println("Enter 2nd Number : ");
        float num2=sc.nextFloat();
        System.out.println("Which Arithmatic Operation you want to perform: +, -, *, /, % : ");
        char ch=sc.next().charAt(0);
        float result=0;
        switch(ch){
            case '+':
                System.out.println("Result= "+(result=(num1+num2)));
                break;
            case '-':
                System.out.println("Result= "+(result=(num1-num2)));
                break;
            case '*':
                System.out.println("Result= "+(result=(num1*num2)));
                break;
            case '/':
                System.out.println("Result= "+(result=(num1/num2)));
                break;
            case '%':
                System.out.println("Result= "+(result=(num1%num2)));
                break;
            default:
                System.out.println("No Output");
        }
        sc.close();


    }
}

/*
OUTPUT 1 :
Enter 1st Number :
5
Enter 2nd Number :
5
Which Arithmatic Operation you want to perform: +, -, *, /, % :
%
Result= 0.0

OUTPUT 2 :
Enter 1st Number :
10
Enter 2nd Number :
2
Which Arithmatic Operation you want to perform: +, -, *, /, % :
/
Result= 5.0

OUTPUT 3:
Enter 1st Number :
100
Enter 2nd Number :
50
Which Arithmatic Operation you want to perform: +, -, *, /, % :
*
Result= 5000.0

OUTPUT 4:
Enter 1st Number :
105
Enter 2nd Number :
60
Which Arithmatic Operation you want to perform: +, -, *, /, % :
-
Result= 45.0

OUTPUT 5:
Enter 1st Number :
88
Enter 2nd Number :
9
Which Arithmatic Operation you want to perform: +, -, *, /, % :
/
Result= 9.777778

OUTPUT 6:
Enter 1st Number :
236
Enter 2nd Number :
6
Which Arithmatic Operation you want to perform: +, -, *, /, % :
?
No Output

 */