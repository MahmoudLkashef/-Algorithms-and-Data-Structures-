package hashtable;

public class HashTable<T, E> {
    private int capacity;
    private Entry[] entries;
    public HashTable() {
        capacity = 10;
        entries=new Entry[capacity];
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        entries=new Entry[capacity];
    }

    /*
    * This method add new entry to the hash table
    * @param key contains the key of new entry
    * @param value contains the value of the new entry
    */
    public void put(T key,E value)
    {
        Entry<T,E> entry=new Entry<>(key,value);
        int hashCode=getHash(key);
        if(entries[hashCode]==null)
        {
            entries[hashCode]=entry;
            return;
        }
        Entry<T,E> temp=entries[hashCode];
        while(temp.next!=null)temp=temp.next;
        temp.next=entry;
    }
    /*
    * This method returns the value of the key
    * @param key contains the key of desired value
    */
    public E get(T key)
    {
        int hashCode=getHash(key);
        if(entries[hashCode]==null)return null;
        Entry<T,E>temp=entries[hashCode];
        while(temp!=null && !temp.key.equals(key))temp=temp.next;
        if(temp==null)return null;
        return temp.value;
    }
    /*
    * This method remove the key-value pair from hash table
    * @param key contains the key of the value to be deleted
    */
    public void remove(T key)
    {
        int hashCode=getHash(key);
        if(entries[hashCode]==null)return;
        Entry<T,E>temp=entries[hashCode];
        Entry<T,E>preTemp=entries[hashCode];
        if(temp.key.equals(key)){entries[hashCode]=temp.next;return;}
        while(temp!=null && !temp.key.equals(key)){preTemp=temp; temp=temp.next;}
        if(temp==null)return;
        preTemp.next=temp.next;
        temp=null;
    }
    public int size() // This method return the size of the hash table
    {
        int counter=0;
        for(Entry entry : entries)
        {
            while (entry!=null){entry=entry.next; counter++;}
        }
        return counter;
    }
    public boolean contains(T key) //This method returns true if the key exist in the hash table
    {
        int hashCode=getHash(key);
        if(entries[hashCode]==null)return false;
        if(entries[hashCode].key.equals(key))return true;
        Entry temp=entries[hashCode];
        while(temp!=null && !temp.key.equals(key))temp=temp.next;
        if(temp==null)return false;
        return true;
    }
    public void display() // This method display the items of hash table
    {
        for(Entry entry:entries)
        {
            while(entry!=null)
            {
                System.out.println("Key : "+entry.key+" - Value : "+entry.value);
                entry=entry.next;
            }
        }
    }
    private int getHash(T data) { //This method hashed the key and returns it's index
        return data.hashCode() % capacity;
    }


}
