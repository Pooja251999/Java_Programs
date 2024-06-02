package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Method;

//Method overriding and use of super keyword to access parent class method..

public class Dog extends Animal{
    void display(){
        System.out.println("I am a Dog...");
    }
    void printmessage(){
        super.display();
        display();
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.printmessage();
    }
}
/*
OUTPUT :
I am an Animal...
I am a Dog...
*/