package arraylist;

//package chapter_3;
import java.util.*;
class arraylist9 {
    public static void main(String args[]){
        LinkedList list = new LinkedList<>();

        list.add("pooja");
        list.add("pari");
        list.add("Uma");
        list.add("praniti");
        list.add("Tushara");

        System.out.println(list);

        list.remove("Umesh"); //remove umesh from list
        System.out.println(list);

        list.removeLast();  //remove last value from list
        System.out.println(list);
    }
}