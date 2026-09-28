import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Angular");
        queue.offer("Java");
        queue.offer("Spring boot");

        System.out.println("show queue data   ----> "+ queue);

        System.out.println("check peek   -------> " + queue.peek());

        System.out.println("check poll ele  ----->"+ queue.poll());
        System.out.println("show again queue   ---->"+ queue);
        System.out.println(" offer again React ------>  "+ queue.offer("React"));

        System.out.println("show again queue   ---->"+ queue);
    }
}
