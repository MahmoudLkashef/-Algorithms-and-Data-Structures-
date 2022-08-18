# Algorithms and Data Structures - Part 1

## What we will cover ?
- Asymptotic analysis
- Array and linkedlist
- Stacks and queues 
- Binary search tree
- Hash table and hash functions

## What is Data Structure ?
It's a location that can be used to store and organize data.
### Examples:
- Arrays, linkedlist, Stack, Queue, etc.

## What is Algorithms ?
A collection of steps to solve the problem.
### Example:
- Linear search algorithm\
Suppose you have a collection of data and you want to find the biggest element in the collection.\
To solve this problem, we will use a linear search algorithm, It will iterate one by one until find the element you want. 

## Asymptotic analysis
When we talk about asymptotic analysis we talks about resources.\
what are resources ?
- Operations : The number of time that we need to perform some operations
- Memory : How much memory is consumed by algorithms
- Others : Network transfer, disk usage , etc.\
In computer science when we talk about resources we talk about operations.\
If you write a program and you want know how long it takes to run a program ? \
Then you need to know about time and space complexity.

### Time complexity
Time complexity describes the number of operations a program will execute for the given size of input n.

To calculate the time complexity of your algorithm you need to know about Big O notation.

#### Big O notation
Describes the performance of an algorithm as amount of data increases, It's a machine independent , Ignore smaller operations O(n+1) --> O(n)
##### Examples: 
- O(1)
- O(n)
- O(log n)
- O(n^n)

n = amount of data


We have 3 behaviors to measure your algorithm 
- Best case (Big-Ω)
- Average case (Big-Θ)
- Worst case (Big-O)

when we talk about Big O notation we talk about worst case behavior to measure your algorithm complexity we care about worst case only.

## Arrays
Array is a linear data structure it's a collection of items of same data type.\
Array zero-based the first item in the array has an index of 0.
- numeric indexing 
- access individual items
- static or dynamic sizing
- fixed size once created
### Usage
```java
//create an integer array of size 5
int []arr=new int[5];
//access the array to add data to it
for(int i=0;i<5;i++)arr[i]=i;
//print the array values
for(int i=0;i<5;i++)System.out.println(arr[i]);
// 0  1  2  3  4
```

### Dynamic Array
One limitation of arrays is that they have fixed size, meaning you need to specify the number of elements your array will hold ahead of time.
A dynamic array expands as you add more elements. So you don't need to determine the size ahead of time.
#### Static array
```java
int []arr=new int[5];
/*
Static array allocated inside stack memory.
Static arrays are allocated memory at compile time.
*/ 
```
#### Dynamic array
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<Integer> id = new ArrayList<Integer>(); // Create an ArrayList object

/*
Dynamic array allocated inside heap memory.
Dynamic array is located at run time.
*/ 
```
### Time Complexity of Array
- Access O(1)
- Search O(n)
- Insert O(n)
- Delete O(n)

#### Advantages
- Random access of elements O(1)
- Good locality of reference and data cache utilization

#### Disadvantages
- Waste more memory
- Shifting elements/Expanding/Shrinking the array is O(N)

## Linked List
Linked list is a linear data structure that consists of nodes where each node contains a data field and a reference(link) to the next node in the list.
Linked list similar to a chain, each link in the chain is called node, the node contains two things single value and reference that refers to the next item in the list.


### Types of linked List
- Singly linked list
- Doubly linked list 
- Circular linked list 
#### Singly Linked List
A linked list that provides forward iteration from the start to the end of the list.

#### Doubly Linked List
A linked list that provides forward iteration from the start to the end of the list, and reverse iteration from end to start.

#### Circular Linked List
A linked list in which the first and the last nodes are also connected to each other to form a circle.

### Usage

```java
import java.util.LinkedList; // import the linkedList class
LinkedList<String>linkedList=new LinkedList<>(); // create a likedList object
linkedList.add("mahmoud");
linkedList.add("reda");
System.out.println(linkedList); // output : [mahmoud, reda]
```
### Time Complexity of Linked List
- Access O(n)
- Search O(n)
- Insert O(1)
- Delete O(n)

#### Advantages
- Dynamic Data structure
- Insertion of nodes O(1)
- No memory waste

#### Disadvantages
- Greater memory usage
- No random access of elements

#### Uses
- Music Player
- Implement stacks and queues


## Stack
A Last-In First-Out (LIFO) data container this means the last element inserted inside the stack is removed first, Stack store objects into a sort of vertical tower.

Example : The pile of books on your study table is an example of a stack.

push() : To add to the top of the stack

pop() : To remove from the top of the stack

### Usage

```java
import java.util.Stack; //import the stack class
Stack<String>books=new Stack<>(); //create a stack object
books.push("book 1"); // add item to the stack
books.push("book 2");
System.out.println(books.peek());// print the top of the stack
//output : book 2
books.pop(); // pop or remove the top of the stack
System.out.println(books.peek()); // output : book 1
```
### Time Complexity of Stack
- Access O(n)
- Search O(n)
- Insert O(1)
- Delete O(1)

### Uses
- Undo/Redo features in text editors
- Moving back/forward through browser history
- Calling functions 

## Queue
A First-In First-Out (FIFO) container this means the first element inserted inside queue is removed first.

Example : A line of people waiting to buy a ticket at a cinema hall. A new person will join the line from the end and the person standing at the front will be the first to get the ticket and leave the line.

Enqueue()/Offer() : To add element to the queue

Dequeue()/poll() : To remove the first element of the queue


### Usage
```java
import java.util.LinkedList; //import the Linked List class
import java.util.Queue; //import the queue class
Queue<String> people=new LinkedList<>(); //create a queue object
/*
why we can't create an object of queue directly?
Because queue class is an interface and we can not create an instance of interface
So if you want to use queue class you need a class that implements queue interface
In java there are two classes that implements queues (Linked List and Priority Queue)
we used Linked List because the priority queue will rearrange their elements based on certain priority
*/
people.offer("person 1"); // add items in the queue
people.offer("person 2");
System.out.println(people.peek()); // print the first item in the queue
// output : person 1
people.poll(); // will remove the first item in the queue
System.out.println(people.peek()); //output : person 2

```
### Time Complexity of Queue
- Access O(n)
- Search O(n)
- Insert O(1)
- Delete O(1)

### Uses
- Printer Queue 
- Keyboard Buffer (Letters should appears on the screen in order they are pressed)


## Deque
A Deque also known as double ended queue , is an ordered collection of items similar to the queue , it also has two ends front and rear.
The main difference between queue and deque is that in deque the insertion and deletion of the elements can happen from the front and end.

offerFirst(): Adds an item at the front of Deque.

offerLast(): Adds an item at the rear of Deque.

pollFirst(): Deletes an item from the front of Deque.

pollLast(): Deletes an item from the rear of Deque.

peekFirst(): Gets the front item from the queue.

peekLast(): Gets the last item from queue.

### Usage
```java
import java.util.Deque; //import deque class
import java.util.LinkedList; // import linked list class
Deque<Integer>numbers=new LinkedList<Integer>();//create a deque object 
numbers.offerFirst(1); // add item to the front of deque
numbers.offerFirst(2);
numbers.offerLast(3); // add item to the end of deque
System.out.println(numbers); // output : [2, 1, 3]
```


## Binary Search Tree
It's a search algorithm that finds the position of a target value within a sorted array.
Half of the array is eliminated during each step .

A binary tree where nodes with lessor values are placed to the left of the root, and nodes with equal or greater values are placed to the right.

### Advantages of Binary search tree
- Searching an element in the Binary search tree is easy as we always have a hint that which subtree has the desired element.

- As compared to array and linked lists, insertion and deletion operations are faster in BST.

### Time Complexity
In average cases,the above mentioned properties enable the insert, search and deletion operations in O(log n) time where n is the number of nodes in the tree. However, the time complexity for these operations is O(n) in the worst case when the tree becomes unbalanced.


### Types of Traversals
- Pre-order Traversal
- In-order Traversal
- Post-order Traversal

The pre-order traversal will visit nodes in Parent-LeftChild-RightChild order.
In this way , it help us to create a copy of a tree the same structure of the original tree.

The in-order traversal will visit nodes in LeftChild-Parent-RightChild order. In this way, the tree is traversed in an ascending order of keys.

The post-order traversal will visit nodes in LeftChild-RightChild-Parent order.

### Usage
```java
    public static void main(String[] args) {
        int []arr={1,2,6,9,11};
        System.out.println(BST(arr,6));//output : 2
        
    }
    public static int BST(int[]arr,int target) {
        int begin = 0, end = arr.length-1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) begin = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
```

## Hash Table
A data structure that stores unique key to values, Each key/value pair is known as an entry.

Fast insertion, search , deletion of key/value pairs.

Hashing : In a hash table we use the hash % capacity to calculate an index number
Example: key.hashCode() % capacity = index

Collision : hash function generates the same index for more than one key.

Bucket : an indexed storage location for one or more entries , it can store multiple entries in case of a collision linked the entries same as linked list.

```java
        import java.util.Hashtable; //import hash table class
        Hashtable<Integer,String> employees=new Hashtable<>(); //create hash table object
        employees.put(1,"mahmoud"); // add item to the hash table
        employees.put(2,"ahmed");
        employees.put(3,"ali");

        System.out.println(employees.get(2)); // get function takes key as a param and return it's value
        //output : ahmed
        employees.remove(3); //remove key/value pair

        for(Map.Entry<Integer,String> it :employees.entrySet()) // iterate through hash table
            System.out.println("key : "+it.getKey()+" value : "+it.getValue());
        /*
         output : 
         key : 2 value : ahmed
         key : 1 value : mahmoud
         */
``` 

### Time Complexity of Hash Table
Hash tables provide constant-time O(1) lookup on average, regardless of the number of items in the table. The worst-case lookup time in most hash table schemes is O(n).




