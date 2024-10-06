package arraylist;
//package chapter_3;
import java.util.*;

public class arraylist6 {
    public static void main(String args[]){
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        list.remove(2); //it will removes number at 2 index

        System.out.println(list);

        list.clear();//it will delete all elements from list

        System.out.println(list);
    }
}