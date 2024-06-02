package Java_Programs.OOPs_Concept_Programs.SuperKeyword_Programs.SUPER_Method;

public class Car extends Vehicle{
    int maxSpeed=120;
    void display(){
        System.out.println("MaxSpeed 1 : "+super.maxSpeed);
        System.out.println("MaxSpeed 2 : "+this.maxSpeed);
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}
/*
OUTPUT :
MaxSpeed 1 : 100
MaxSpeed 2 : 120
 */