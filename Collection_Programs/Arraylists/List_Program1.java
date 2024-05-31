package Java_Programs.Collection_Programs.Arraylists;

import java.util.ArrayList;
import java.util.List;

public class List_Program1 {
    public static void main(String[] args) {
        List list1=List.of("milk","bread","butter","Cheese");
        System.out.println("List1 Elements : "+list1);
        System.out.println("Size of the list : "+list1.size());
        System.out.println("0th index element from the list : "+list1.get(0));
        System.out.println("Is list empty? "+list1.isEmpty());
        System.out.println(list1);

        //Getting error in below when trying to add an element, as class loading is done n exen is going on so we cant add
        //the element at this time, so we need to go with the classed...
        //list1.add("Mango");





        List list2=new ArrayList();
        list2=list1;    //Copying list1 to list2..
        System.out.println("List2 Elements after copying: "+list2);
        System.out.println(list2.get(3));
        list2.add("Apple");
        System.out.println(list2);

    }
}
