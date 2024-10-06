class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) { data = d; next = null; }
    }

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.printList();
    }
}
