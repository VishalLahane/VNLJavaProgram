package LinkedList;

import java.util.LinkedList;

class linkedlist {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("anamika");
        obj.add("pari");
        System.out.println(obj);
        obj.add("pranali");
        System.out.println(obj);
        obj.addFirst("Vishali");
        System.out.println(obj);
        obj.add("Radha");
        System.out.println(obj);
        obj.addLast("Sanika");
        System.out.println(obj);
        obj.add(3,"Suhani");
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
        obj.removeLast();
        System.out.println(obj);
    }
}