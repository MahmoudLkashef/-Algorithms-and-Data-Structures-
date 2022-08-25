package hashtable;

public class Entry<T,E> {
    T key;
    E value;
    Entry next;

    public Entry(T key, E value) {
        this.key = key;
        this.value = value;
        this.next=null;
    }
}
