package Java_Programs.Loop_Programs.For_Loop;

public class For_Loop_FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0)
                System.out.println("Fizz="+i);
            if(i%5==0)
                System.out.println("Buzz="+i);
            if(i%3==0&&i%5==0)
                System.out.println("FizzBuzz="+i);
        }
    }
}
/*
OUTPUT:
Fizz=3
Buzz=5
Fizz=6
Fizz=9
Buzz=10
Fizz=12
Fizz=15
Buzz=15
FizzBuzz=15
Fizz=18
Buzz=20
Fizz=21
Fizz=24
Buzz=25
Fizz=27
Fizz=30
Buzz=30
FizzBuzz=30
Fizz=33
Buzz=35
Fizz=36
Fizz=39
Buzz=40
Fizz=42
Fizz=45
Buzz=45
FizzBuzz=45
Fizz=48
Buzz=50
 */