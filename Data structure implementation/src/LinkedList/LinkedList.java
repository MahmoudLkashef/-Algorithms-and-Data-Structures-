package LinkedList;

public class LinkedList <T>{
    private class Node
    {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next=null;
        }
    }
    private Node head;
    int size;

    public LinkedList() {
        head=null;
        size=0;
    }

    /*
    * This method add new entry to the end of list
    * @param data contains the new entry
    */
    public void add(T data)
    {
        Node node=new Node(data);
        size++;
        if(isEmpty())head=node;
        else
        {
            Node temp=head;
            while(temp.next != null)temp=temp.next;
            temp.next=node;
        }
    }

    /*
    * This method add new entry to list at specific position
    * @param data contains the new entry
    * @param position contains the position of new entry
    */
    public void add(T data,int position)
    {
        Node node=new Node(data);
        size++;
        if(position==0)
        {
            node.next=head;
            head=node;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1 && temp.next!=null ;i++)temp=temp.next;
        node.next=temp.next;
        temp.next=node;
    }
    public boolean isEmpty() //This method returns true if list is empty
    {
        return head==null;
    }

    /*
    * This method removes item from the list
    * @param data contains the item to be deleted
    */
    public void remove(T data)
    {
        if(isEmpty()){System.out.println("The Linked List is empty");return;}
        if(head.data==data)head=head.next;
        else {
            Node previous = null, current = head;
            while (current != null && current.data != data) {
                previous = current;
                current = current.next;
            }
            if (current == null) return;
            previous.next = current.next;
            current = null;
        }
        size--;
        remove(data);

    }
    /*
    * This method removes item at specific position
    * @param position contains the position of item to be deleted
    */
    public void removeAtPosition(int position)
    {
        if(isEmpty())return;
        if(position==0){Node temp=head;head=head.next;temp=null;size--;return;}
        Node temp=head;
        for(int i=0;i<position-1 && temp.next!=null ;i++)temp=temp.next;
        if(temp.next==null)return;
        Node targetNode=temp.next;
        temp.next=targetNode.next;
        targetNode=null;
        size--;
    }
    public int size() //This method returns the size of list
    {
        return size;
    }
    public void display() //This method display the items of the list
    {
        Node temp=head;
        while(temp!=null) {System.out.println(temp.data);temp=temp.next;}
    }
}
