package tree;

import queue.Queue;

public class BinarySearchTree {
    private class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    Node root=null;
    private void addHelper(Node root,int data)
    {
        if(data<root.data)
        {
            if(root.left==null)
            {
                Node node=new Node(data);
                root.left=node;
            }
            else addHelper(root.left,data);
        }
        else
        {
            if(root.right==null)
            {
                Node node=new Node(data);
                root.right=node;
            }
            else addHelper(root.right,data);
        }
    }
    private int getMaxHelper(Node root)
    {
        if(root.right==null)return root.data;
        return getMaxHelper(root.right);
    }
    private int getMinHelper(Node root)
    {
        if(root.left==null)return root.data;
        return getMinHelper(root.left);
    }
    private void preOrderHelper(Node root)
    {
        if(root==null)return;
        System.out.println(root.data);
        preOrderHelper(root.left);
        preOrderHelper(root.right);
    }
    private void inOrderHelper(Node root)
    {
        if(root==null)return;
        inOrderHelper(root.left);
        System.out.println(root.data);
        inOrderHelper(root.right);    }
    private void postOrderHelper(Node root)
    {
        if(root==null)return;
        postOrderHelper(root.left);
        postOrderHelper(root.right);
        System.out.println(root.data);
    }
    private boolean searchHelper(Node root,int data)
    {
        if(root==null)return false;
        if(root.data==data)return true;
        if(root.data>data)return searchHelper(root.left,data);
        return searchHelper(root.right,data);
    }
    private Node removeHelper(Node root,int data)
    {
        if(root==null)return null;
        else if(data<root.data)root.left=removeHelper(root.left,data); //root.left -> parent of deleted node
        else if(data>root.data)root.right=removeHelper(root.right,data); // root.right -> parent of deleted node
        else  // found the data
        {
            if(root.left==null) // leaf node or one child
            {
                Node temp=root.right;
                root=null;
                return temp;
            }
            else if(root.right==null)// leaf node or one child
            {
                Node temp=root.left;
                root=null;
                return temp;
            }
            else // two children
            {
                int maxValue=getMaxHelper(root.left);
                root.data=maxValue;
                root.left=removeHelper(root.left,maxValue);
            }
        }
        return root;
    }
    public void add(int data)
    {
        Node node=new Node(data);
        if(isEmpty())root=node;
        else addHelper(root,data);
    }
    public int getMax()
    {
        return getMaxHelper(root);
    }
    public int getMin()
    {
        return getMinHelper(root);
    }
    public void displayLevelOrder()
    {
        if(isEmpty())return;
        Queue<Node>nodeQueue=new Queue<>();
        nodeQueue.enqueue(root);
        while (!nodeQueue.isEmpty())
        {
            Node current=nodeQueue.peek();
            nodeQueue.dequeue();
            System.out.println(current.data);
            if(current.left!=null)nodeQueue.enqueue(current.left);
            if(current.right!=null)nodeQueue.enqueue(current.right);
        }
    }
    public void displayPreOrder()
    {
        if(isEmpty())return;
        preOrderHelper(root);
    }
    public void displayInOrder()
    {
        if(isEmpty())return;
        inOrderHelper(root);
    }
    public void displayPostOrder()
    {
        if(isEmpty())return;
        postOrderHelper(root);
    }
    public boolean search(int data)
    {
        if(isEmpty())return false;
        return searchHelper(root,data);
    }
    public void remove(int data)
    {
        if(isEmpty())return;
        root=removeHelper(root,data);
    }
    public boolean isEmpty()
    {
        return root==null;
    }
}
