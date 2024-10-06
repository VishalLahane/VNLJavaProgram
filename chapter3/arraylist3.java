ackage arraylist;

//package chapter_3;
import java.util.*;
public class aaraylist3 {

    public static void main(String[] args){
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //get and set methods
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //accessing element
        System.out.println(list.get(0));
        list.set(0,100);

        System.out.println(list.get(0));
    }
}