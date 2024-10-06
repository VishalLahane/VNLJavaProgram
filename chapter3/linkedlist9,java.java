package LinkedList;

import java.util.LinkedList;

public class linkedlist9 {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("arya");
        obj.add("padmini");
        System.out.println(obj);
        obj.add("pranali");
        System.out.println(obj);
        obj.addFirst("manali");
        System.out.println(obj);
        obj.add("Rani");
        System.out.println(obj);
        obj.addLast("Sanika");
        System.out.println(obj);
        obj.add(3,"Suhani");
        System.out.println(obj);

    }
}