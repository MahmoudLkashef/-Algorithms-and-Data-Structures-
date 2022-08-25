package queue;

public class Queue<T> {
private class Node
{
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next=null;
    }
}
private Node front,rear;
private int size;

    public Queue() {
        front=rear=null;
        int size=0;
    }
    /*
    * This method add new entry to the end of queue
    * @param data contain the new entry
    */
    public void enqueue(T data)
    {
        Node node=new Node(data);
        size++;
        if(isEmpty())front=rear=node;
        else
        {
            rear.next=node;
            rear=node;
        }
    }
    public boolean isEmpty() //This method returns true if queue is empty
    {
        return front==null&&rear==null;
    }
    public void dequeue() //This method remove the first item in the queue
    {
        if (isEmpty())
        {
            System.out.println("The Queue is empty");
            return;
        }
        size--;
        //if front and rear are equal this means that we have only one item so we remove it
        if(front==rear)front=rear=null;
        else
        {
            Node temp=front;
            front=front.next;
            temp=null;
        }
    }
    public T peek() //This method return the first item in the queue
    {
        if(isEmpty())return null;
        return front.data;
    }
    public int size() // This method returns the size of the queue
    {
        return size;
    }
}
