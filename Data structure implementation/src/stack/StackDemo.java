package stack;

public class StackDemo {
    public static void main(String[] args)
    {
        Stack<String>books=new Stack<>();
        books.push("book 1");
        books.push("book 2");
        books.push("book 3");
        while (!books.isEmpty())
        {
            System.out.println(books.peek());
            books.pop();
        }
    }
}
