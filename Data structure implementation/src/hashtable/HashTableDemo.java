package hashtable;

public class HashTableDemo {
    public static void main(String[] args)
    {
        HashTable<Integer,String>employees=new HashTable<>();
        employees.put(1,"mahmoud");
        employees.put(2,"ahmed");
        employees.put(3,"ali");
        employees.remove(2);
        employees.display();
    }
}
