package deque;

public class Deque<T> {
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
    private Node first;
    private Node last;
    private int size;

    public Deque() {
        first=null;
        last=null;
        size=0;
    }
    /*
     * This method add new entry to the begin of Deque
     * @param data contains the new entry
     */
    public void addFirst(T data)
    {
        Node node=new Node(data);
        size++;
        if(isEmpty())first=last=node;
        else
        {
            first.previous=node;
            node.next=first;
            first=node;
        }
    }
    /*
    * This method add new entry to the last of Deque
    * @param data contains the new entry
    */
    public void addLast(T data)
    {
        Node node=new Node(data);
        size++;
        if(isEmpty())first=last=node;
        else
        {
            last.next=node;
            node.previous=last;
            last=node;
        }
    }
    public void removeFirst()// This method removes the first item in the Deque
    {
        if(isEmpty())return;
        Node temp=first;
        first=temp.next;
        if(first==null)first=last=null;
        else first.previous=null;
        temp=null;
        size--;
    }
    public void removeLast() // This method removes the last item in the Deque
    {
        if(isEmpty())return;
        Node temp=last;
        last=temp.previous;
        if(last==null)last=first=null;
        else last.next=null;
        temp=null;
        size--;
    }
    public T getFirst() // This method returns the first item in the Deque
    {
        if(isEmpty())return null;
        return first.data;
    }
    public T getLast() // This methods returns the last item in the Deque
    {
        if(isEmpty())return null;
        return last.data;
    }
    public int getSize() //This method returns the size of Deque
    {
        return size;
    }
    public boolean isEmpty() // This method returns true if Deque is empty
    {
        return first==null && last==null;
    }

}
