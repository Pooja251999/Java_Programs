package Java_Programs.OOPs_Concept_Programs.Polymorphism_Programs.Method_Overriding;

public class Main_Dog_Hound {
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();

        Dog d1=new Dog();
        d1.bark();

        Dog d2=new Hound(); //Dynamic Dispatch
        //Dyanamic dispatch-Dynamic Method Dispatch in Java is the process by which a call to an overridden
        // method is resolved at runtime (during the code execution).
        d2.bark();
    }
}
/*
OUTPUT :

I am Hound, I will Sniff...
I am Dog, I will Bark...
I am Hound, I will Sniff...
 */
