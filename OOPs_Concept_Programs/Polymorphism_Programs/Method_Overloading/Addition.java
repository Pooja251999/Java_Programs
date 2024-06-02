package Java_Programs.OOPs_Concept_Programs.Polymorphism_Programs.Method_Overloading;

public class Addition {
    public static void main(String[] args) {
        Add_Functions a=new Add_Functions();
        System.out.println("Addition of 15+100           : "+a.add(15,100));
        System.out.println("Addition of -200+100+999     : "+a.add(-200,100,999));
        System.out.println("Addition of 976-124-843+1264 : "+a.add(976,-124,-843,1264));
    }

}
class Add_Functions{
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }
    int add(int a , int b, int c, int d){
        return a+b+c+d;
    }
}
/*
OUTPUT :
Addition of 15+100           : 115
Addition of -200+100+999     : 899
Addition of 976-124-843+1264 : 1273
 */