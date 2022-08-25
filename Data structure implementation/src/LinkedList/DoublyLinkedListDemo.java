package LinkedList;

public class DoublyLinkedListDemo {
    public static void main(String[] args)
    {
        DoublyLinkedList<String>nodes=new DoublyLinkedList<String>();
        nodes.add("node 1");
        nodes.add("node 2");
        nodes.add("node 3",0);
        nodes.remove("node 2");
        nodes.removeAtPosition(0);
        nodes.display();
    }
}
