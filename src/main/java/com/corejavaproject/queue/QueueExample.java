import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> line = new LinkedList<>();

        // 1. Enqueue: Add elements to the tail
        line.add("Alice");
        line.add("Bob");
        line.add("Charlie");

        System.out.println("Queue: " + line);

        // 2. Peek: Look at the front element without removing it
        String front = line.peek();
        System.out.println("Front element: " + front);

        // 3. Dequeue: Remove and return the front element
        String removed = line.remove();
        System.out.println("Removed element: " + removed);

        // See what's left
        System.out.println("Queue after dequeue: " + line);

        // 4. Check size and if it's empty
        System.out.println("Is queue empty? " + line.isEmpty());
        System.out.println("Queue size: " + line.size());
    }
}