package LinkedList;

import java.util.LinkedList;

public class linkedlist4
{
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("anamika");
        obj.add("pari");
        System.out.println(obj);
        obj.add("pranita");
        System.out.println(obj);
        obj.addFirst("Vaishali");
        System.out.println(obj);
    }
    }