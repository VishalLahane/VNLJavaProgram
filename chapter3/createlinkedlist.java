class LinkedList {
    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) { data = d; next = null; }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        // Print the list
        Node n = list.head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
