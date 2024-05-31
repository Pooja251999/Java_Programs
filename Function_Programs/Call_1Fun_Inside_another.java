package Java_Programs.Function_Programs;

public class Call_1Fun_Inside_another {
    public static void main(String[] args) {
        f1();
        String[] names={"Pooja", "Amalgiri"};
        f1(names);
    }

    static void f1(){
        f2();
        System.out.println("f1");
    }
    static void f2(){
        System.out.println("f2");
    }
    static void f1(String[] a){
        String name[]=a;
        for (int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }
    }
}
/*
OUTPUT :
f2
f1
Pooja
Amalgiri

 */