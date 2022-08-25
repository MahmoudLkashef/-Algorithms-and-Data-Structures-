package tree;

public class BSTDemo {
    public static void main(String[] args)
    {
        BinarySearchTree tree=new BinarySearchTree();
        tree.add(60);
        tree.add(50);
        tree.add(80);
        tree.add(75);
        tree.add(40);
        tree.add(90);
        tree.add(65);
        tree.add(30);
        System.out.println(tree.search(40));
        tree.remove(80);
        tree.displayInOrder();
    }
}
