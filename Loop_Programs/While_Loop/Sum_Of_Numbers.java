package Java_Programs.Loop_Programs.While_Loop;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("Sum Of First 10 Numbers : "+sum);
    }
}
/*
OUTPUT:
Sum Of First 10 Numbers : 55
 */