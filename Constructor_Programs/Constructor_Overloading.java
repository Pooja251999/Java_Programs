package Java_Programs.Constructor_Programs;

public class Constructor_Overloading {
    String subject_name1;
    Constructor_Overloading(){
        subject_name1="Java Programming";
        System.out.println("Subject Name from DC : "+subject_name1);
    }
    Constructor_Overloading(String subject_name2){
        String sub=subject_name2;
        System.out.println("Subject Name from PC : "+sub);
    }

    public static void main(String[] args) {
        Constructor_Overloading c1=new Constructor_Overloading();
        Constructor_Overloading c2=new Constructor_Overloading("Python Programming");
    }
}
/*
OUTPUT :

Subject Name from DC : Java Programming
Subject Name from PC : Python Programming
 */