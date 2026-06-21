import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> q = new LinkedList<>();

        // Insert elements
        q.add(10);
        q.add(20);
        q.add(30);
		q.add(40);

        System.out.println("Queue: " + q);

        // Remove first element
        System.out.println("Deleted Element: " + q.remove());

        System.out.println("Queue After Deletion: " + q);
    }
}