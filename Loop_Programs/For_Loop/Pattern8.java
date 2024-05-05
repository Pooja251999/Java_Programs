package Java_Programs.Loop_Programs.For_Loop;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
5
44
333
2222
11111
 */