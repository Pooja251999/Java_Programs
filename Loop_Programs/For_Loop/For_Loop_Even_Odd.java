package Java_Programs.Loop_Programs.For_Loop;

public class For_Loop_Even_Odd {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even--> " + i);
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
 */