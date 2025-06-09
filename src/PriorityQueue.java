

// A generic implementation of a priority queue data structure backed by a linked list
public class PriorityQueue<T> {

    // Represents a node in the priority queue
    class Node<T> {
        T value;
        int priority;
        Node<T> next;

        // Constructs a node with a value, priority, and link to next node
        Node(T v, int p, Node<T> n) {
            value = v;
            priority = p;
            next = n;
        }
    }

    Node<T> first = null;
    Node<T> last = null;
    private int count = 0;

    public void enqueue(T item, int priority) {

    }


}
