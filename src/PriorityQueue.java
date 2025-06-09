

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

    // Returns the length of the queue
    public int length() { return count; }

    // Peeks at the value of the first node in the queue
    public T peek() { return first.value; }

    // Checks if the queue is empty
    public boolean isEmpty() { return count == 0; }

    // Enqueues a new node into the priority queue based on its priority
    // Insertion sort based approach
    public void enqueue(T item, int priority) {
         count++;
        if (first == null) {
            first = new Node<T>(item, priority, null);
            last = first;
        } else {
            Node<T> previous = null;
            for (Node<T> current = first; current != null; current = current.next) {
                if (priority < current.priority) {
                    if (previous == null) {
                        first = new Node<T>(item, priority, first);
                    } else {
                        previous.next = new Node<T>(item, priority, current);
                    }
                    return;
                }
                previous = current;
            }
            last.next = new Node<T>(item, priority, null);
            last = last.next;
        }
    }

     public T dequeue() throws IllegalStateException {
        if (first != null) {
            T temp = first.value;
            first = first.next;
            count--;
            return temp;
        }
        throw new IllegalStateException("Queue Underflow: No items can be dequeued from the queue, its empty!");
    }


}
