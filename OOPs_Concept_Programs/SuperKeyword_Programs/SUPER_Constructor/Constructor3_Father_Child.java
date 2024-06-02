package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Constructor;
//Constructor Chaining- one constructor is Calling another Constructor
public class Constructor3_Father_Child {
    public static void main(String[] args) {
    Child c1=new Child();
    Child c2=new Child("2BHK", 25);
    c2.display1();
    Child c3=new Child("3BHK", 23, 1500000);
    c3.display2();
    }
}
class Father{
    String type;
    Father(){
        System.out.println("Father DC ! ");
    }

    Father(String hometype){
        this.type=hometype;
        System.out.println("Father PC ! ");
    }
}
class Child extends Father{
    String type;
    int a;
    float s;
    Child(){
        System.out.println("Child DC ! ");
    }
    Child(String hometype){

        this.type=hometype;
        System.out.println("Child PC1 ! ");
    }
    Child(String hometype, int age){
        this(hometype);
        this.a=age;
        System.out.println("Child PC2 ! ");
    }
    Child(String hometype, int age, float sal){
        this(hometype,age);
        this.s=sal;
        System.out.println("Child PC3 ! ");
    }
    void display1(){
        System.out.println("Hometype: " +this.type+ " Age: " +a);
    }
    void display2(){
        System.out.println("Hometype: " +this.type+ " Age: " +a+ " Salary: " +s);
    }
}
