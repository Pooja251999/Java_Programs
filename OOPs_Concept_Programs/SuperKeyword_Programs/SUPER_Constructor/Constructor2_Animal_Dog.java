package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Constructor;

public class Constructor2_Animal_Dog {
    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d=new Dog("Labra Dog");

    }
}
class Animal{
    Animal(){
        System.out.println("Animal DC !");
    }
    Animal(String name){
        System.out.println("From Parent Class --> Animal Name : "+name);
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog DC !");
    }
    Dog(String name){
        super(name);
        System.out.println("Dog PC !");
    }
}
/*
Animal DC !
Dog DC !
From Parent Class --> Animal Name : Labra Dog
Dog PC !
 */