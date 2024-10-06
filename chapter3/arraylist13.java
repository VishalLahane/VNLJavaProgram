package arraylist;
//Deque
import java.util.*;

public class arraylist15 {
    public static void main(String args[]){
        //Deque
        Deque<String> dList = new ArrayDeque<>();
        //adding elements in dList
        dList.offer("Vaibhavi");
        dList.offer("Harshada");
        dList.offerFirst("Pranita");//add element at first
        dList.offerLast("Padmini");//add element at last

        System.out.println("Elements in deque:");
        for(String st : dList){
            System.out.println(st);
        }

        System.out.println("First peek element: "+dList.peekFirst());

        System.out.println("Last peek element: "+dList.peekLast());
    }
}