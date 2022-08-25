package LinkedList;

public class DoublyLinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node previous;

        public Node(T data) {
            this.data = data;
            this.next=null;
            this.previous=null;
        }
    }

    private Node head;
    private int size = 0;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    /*
     * This method add new entry to the end of list
     * @param data contains the new entry
     */
    public void add(T data) {
        Node node = new Node(data);
        size++;
        if (isEmpty()) head = node;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
            node.previous = temp;
        }
    }

    /*
     * This method add new entry to list at specific position
     * @param data contains the new entry
     * @param position contains the position of new entry
     */
    public void add(T data, int position) {
        Node node = new Node(data);
        size++;
        if (position == 0) {
            node.next = head;
            head.previous = node;
            head = node;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position && temp.next != null; i++) temp = temp.next;
        if (temp == null) {
            add(data);
            return;
        }
        node.previous = temp.previous;
        temp.previous.next = node;
        temp.previous = node;
        node.next = temp;
    }

    /*
     * This method removes item from the list
     * @param data contains the item to be deleted
     */
    public void remove(T data) {
        if (isEmpty()) return;
        Node temp = head;
        if (head.data == data) {
            head = head.next;
            if (!isEmpty()) head.previous = null;
            temp = null;
        } else {
            while (temp != null && temp.data != data) temp = temp.next;
            if (temp == null) return;
            temp.previous.next = temp.next;
            if (temp.next != null) temp.next.previous = temp.previous;
            temp = null;
        }
        size--;
        remove(data); // to remove duplicate number
    }

    /*
     * This method removes item at specific position
     * @param position contains the position of item to be deleted
     */
    public void removeAtPosition(int position) {
        if (isEmpty()) return;
        Node temp = head;
        size--;
        if (position == 0) {
            head = head.next;
            if (head.next!=null) head.next.previous = null;
            temp = null;
            return;
        }
        for (int i = 0; i < position && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        temp.previous.next = temp.next;
        if (temp.next != null) temp.next.previous = temp.previous;
        temp = null;
    }

    public boolean isEmpty() {
        return head == null;
    } //This method returns true if the list is empty

    public int size() {
        return size;
    } //This method returns the size of list

    public void display() { // This method display the items of the list
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
