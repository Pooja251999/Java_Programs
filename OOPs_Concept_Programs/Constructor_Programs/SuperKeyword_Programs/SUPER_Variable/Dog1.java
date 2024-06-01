package Java_Programs.OOPs_Concept_Programs.Constructor_Programs.SuperKeyword_Programs.SUPER_Variable;

public class Dog1 extends Animal1{
    String type="Dog";

    void printType(){
        System.out.println("Dog type is : "+this.type);
        System.out.println("Animal Type is : "+super.type);
    }

    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.printType();
    }
}
/*
OUTPUT :
Dog type is : Dog
Animal Type is : Animal
 */