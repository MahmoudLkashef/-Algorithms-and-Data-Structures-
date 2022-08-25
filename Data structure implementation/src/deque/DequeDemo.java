package deque;

public class DequeDemo {
    public static void main(String[] args)
    {
        Deque<Integer>numbers=new Deque<>();
        numbers.addLast(3);
        numbers.addFirst(2);
        numbers.addFirst(1);
        while (!numbers.isEmpty())
        {
            System.out.println(numbers.getFirst());
            numbers.removeFirst();
        }
    }
}
