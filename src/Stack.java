


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
    private int size = 0;

    // Constructs an empty stack
    public Stack() {
        top = null;
    }

    // Checks if the stack is empty by checking if the top node is null
    public boolean isEmpty() {
        return top == null;
    }

    // Returns the size of the stack
    public int size() {
        return size;
    }

    // Pushes a new node to the top of the stack
    public void push(T item) {
        top = new Node<T>(item, top);
        size++;
    }

    // Pops the top node from the stack, returns its value
    public T pop() throws IllegalStateException {
        // If the stack isnt empty then we can pop the top node
        if (!isEmpty()) {
            T temp = top.value;
            top = top.next;
            size--;
            return temp;
        }
        throw new IllegalStateException("Stack Underflow: No items can be popped from the stack, its empty!");
    }

    // Peeks at the value of the node at the top of the stack
    public T peek() throws IllegalStateException {

        if (!isEmpty()) {
            return top.value;
        }
        throw new IllegalStateException("Stack Underflow: No items can be peeked from the stack, its empty!");
    }

    // Returns a string representation of the stack
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = top;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }


}
