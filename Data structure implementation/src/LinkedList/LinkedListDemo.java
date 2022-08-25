package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<String>cubes=new LinkedList<String>();
        cubes.add("cube 1");
        cubes.add("cube 3");
        cubes.add("cube 2",1);
        cubes.removeAtPosition(2);
        cubes.display();


    }
}
