package Java_Programs.Collection_Programs.Arraylists;
import java.util.ArrayList;
import java.util.List;
public class Arraylist_Program1 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>();
        //fruits.add("Apple", "Mango", "Banana", "Apple","Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        System.out.println("Size of an Arraylist : "+fruits.size());

        fruits.add(0,"Papaya");
        System.out.println("After adding Papaya to the 0th index: \n"+fruits);
        System.out.println("Is Mango exist in the arraylist: "+fruits.contains("Mango"));
        System.out.println("Last index of Apple: "+fruits.lastIndexOf("Apple"));
        System.out.println("Removing Apple from the Arraylist : "+fruits.remove("Apple"));
        System.out.println(fruits);
        System.out.println("Removing 1st index element from the Arraylist : "+fruits.remove(1));
        System.out.println(fruits);
        System.out.println("Removing Mango from the Arraylist : "+fruits.remove("Mango"));
        System.out.println(fruits);
        System.out.println("Size of an Arraylist : "+fruits.size());
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.set(5,"Guava");
        System.out.println(fruits);
        List<String> temp=fruits.subList(1,4);
        System.out.println("Sublist from index 1 to 4: "+temp);
        System.out.println("Current Arraylist : "+fruits);
        fruits.clear();
        System.out.println("Final List: "+fruits);
    }
}
/*
OUTPUT :
[Apple, Mango, Banana, Apple, Orange]
Size of an Arraylist : 5
After adding Papaya to the 0th index:
[Papaya, Apple, Mango, Banana, Apple, Orange]
Is Mango exist in the arraylist: true
Last index of Apple: 4
Removing Apple from the Arraylist : true
[Papaya, Mango, Banana, Apple, Orange]
Removing 1st index element from the Arraylist : Mango
[Papaya, Banana, Apple, Orange]
Removing Mango from the Arraylist : false
[Papaya, Banana, Apple, Orange]
Size of an Arraylist : 4
[Papaya, Banana, Apple, Orange, Mango, Guava, Grapes]
Sublist from index 1 to 4: [Banana, Apple, Orange]
Current Arraylist : [Papaya, Banana, Apple, Orange, Mango, Guava, Grapes]
Final List: []
*/