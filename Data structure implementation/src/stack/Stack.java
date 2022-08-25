package stack;

public class Stack<T> {
    private class Node
    {
         T data;
         Node next;

        public Node(T data) {
            this.data = data;
            this.next=null;
        }
    }
    private Node top;
    private int size;

    public Stack() {
        top=null;
        size=0;
    }

    /*
    * This method adds new entry to the top of the stack
    * @param data contains the entry
    */
    public void push(T data)
    {
        Node node=new Node(data);
        size++;
        //if stack is empty
        if(isEmpty())node.next=null;
        //stack not empty
        else node.next=top;

        top=node;
    }

    public boolean isEmpty() //This method returns true if the stack is empty
    {
        return top==null;
    }

    public void pop() // This methods removes the top of the stack
    {
        if(isEmpty())
        {
            System.out.println("the Stack is empty");
            return;
        }
        size--;
        Node temp=top;
        top=top.next;
        temp=null;
    }
    public T peek() // This method returns the top of the stack
    {
        if(isEmpty())return null;
        return top.data;
    }
    public int size() // This method returns the size of the stack
    {
        return size;
    }
}
