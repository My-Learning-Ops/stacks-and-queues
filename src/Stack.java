


// A generic implementation of a stack data structure backed by a linked list
public class Stack<T> {

    // Represents a node in the stack
    class Node<T> {
        T value;
        Node<T> next;
        
        // Constructs a node with a value and link to the next node
        Node(T val, Node<T> n) {
            value = val;
            next = n;
        }

        // Constructs a node with a value and no link
        Node(T val) {
            this(val, null);
        }
    }

    private Node<T> top;

    // Constructs an empty stack
    public Stack() {
        top = null;
    }

    







}
