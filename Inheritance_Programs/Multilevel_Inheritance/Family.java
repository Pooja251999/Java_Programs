package Java_Programs.Inheritance_Programs.Single_Inheritance.Multilevel_Inheritance;

public class Family {
    public static void main(String[] args) {

        Grandfather g1=new Grandfather();
        Father f1=new Father();
        Child c1=new Child();
        g1.home();
        f1.home();
        c1.home();
        /*
        GrandFather Property --> 1 BHK
        Father Property --> 2 BHK
        Child Property --> 3 BHK
         */

        Grandfather g2=new Father();
        Father f2=new Child();
       // Child c2=new Grandfather();---Not allowed
        g2.home();
        f2.home();
        /*
        Father Property --> 2 BHK
        Child Property --> 3 BHK
         */

        }
}
