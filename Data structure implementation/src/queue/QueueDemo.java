package queue;

public class QueueDemo {
    public static void main(String[] args)
    {
        Queue<String>people=new Queue<>();
        people.enqueue("person 1");
        people.enqueue("person 2");
        people.enqueue("person 3");
        while (!people.isEmpty())
        {
            System.out.println(people.peek());
            people.dequeue();
        }
    }
}
