package linkedlist;

import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("rani");
        obj.add("sakshi");
        System.out.println(obj);
        obj.add("pranita");
        System.out.println(obj);
        obj.addFirst("neha");
        System.out.println(obj);
        obj.add("Rajshri");
        System.out.println(obj);

    }
}