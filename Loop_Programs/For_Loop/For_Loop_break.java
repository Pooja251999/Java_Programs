package Java_Programs.Loop_Programs.For_Loop;

public class For_Loop_break {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            if(i==5){
                break;
            }
            //System.out.println("After!!");
        }
    }
}
/*
OUTPUT:
0
1
2
3
4
5
 */