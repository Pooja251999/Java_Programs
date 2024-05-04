package Java_Programs.Loop_Programs.While_Loop;

public class Print_Even_Odd_Numbers {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            i++;
            if (i%2==0){
                System.out.println("Even--> "+i);

                continue;
            }

            System.out.println("Odd--> "+i);

        }
    }
}
/*
OUTPUT:
Odd--> 1
Even--> 2
Odd--> 3
Even--> 4
Odd--> 5
Even--> 6
Odd--> 7
Even--> 8
Odd--> 9
Even--> 10
Odd--> 11
 */