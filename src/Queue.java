
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

    // Queues a new node to the end of the queue
    public void enqueue(T item) {
        // If queue is empty, create and assign the first node
        if (first == null) {
            first = new Node<T>(item, null);
            last = first;
        // If queue isnt empty, create a new node and link to the last
        } else {
            last.next = new Node<T>(item, null);
            last = last.next;
        }
        count++;
    }

    // Dequeues a node from the front of the queue
    public T dequeue() throws IllegalStateException {
        if (first != null) {
            T temp = first.value;
            first = first.next;
            count--;
            return temp;
        }
        throw new IllegalStateException("Queue Underflow: No items can be dequeued from the queue, its empty!");
    }

    // Returns a string representation of the queue
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

}
