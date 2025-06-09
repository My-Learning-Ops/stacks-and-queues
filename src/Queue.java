





// A generic implementation of a queue data structure backed by a linked list
public class Queue<T> {

    // Represents a node in the queue
    class Node<T> {
        T value;
        Node<T> next;

        // Constructs a node with a value and link
        Node(T val, Node<T> n) {
            value = val;
            next = n;
        }
    }


    private Node<T> first = null;
    private Node<T> last = null;
    private int count = 0;

    // Returns the length of the queue
    public int length() { return count; }

    // Peeks at the value of the first node in the queue
    public T peek() { return first.value; }

    // Checks if the queue is empty
    public boolean isEmpty() { return count == 0; }

    public void enqueue(T item) {
        
    }











}
