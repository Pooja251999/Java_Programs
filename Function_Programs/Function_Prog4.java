package Java_Programs.Function_Programs;
public class Function_Prog4 {
    public static void main(String[] args) {
        System.out.println("Return type with parameter...");
        int res= addition(10,55,100);
        System.out.println("Addition of 3 numbers : "+res);
    }
    static int addition(int a, int b, int c){
        return (a+b+c);
    }
}
/*
OUTPUT :
Return type with parameter...
Addition of 3 numbers : 165
 */