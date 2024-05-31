package Java_Programs.Inheritance_Programs.Single_Inheritance;

public class Test_Animal {

    public static void main(String[] args) {
        Animal_Dog dog=new Animal_Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
/*
OUTPUT :

From Animal Class --> Eating ...
From Animal Class --> Sleeping ...
From Animal_Dog Class --> Barking ....

 */