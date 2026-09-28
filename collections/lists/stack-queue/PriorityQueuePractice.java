import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        PriorityQueue<String> pr = new PriorityQueue<>(Comparator.reverseOrder());

        pr.offer("Angular");
        pr.offer("Java");
        pr.offer("Spring");

        System.out.println(" priority queue vaues  --------   "+ pr);

        System.out.println("poll value ----- " + pr.poll());

        System.out.println("all values  ----  "+ pr);

        System.out.println("peek values  ---------- " + pr.peek());

        System.out.println("all again  =====  "+ pr);
        System.out.println("check ==== " + pr.contains("Java"));
        System.out.println("all "+ pr);



        // normal 

        PriorityQueue<String> pr2 = new PriorityQueue<>(Comparator.reverseOrder());

        pr2.offer("Angular");
        pr2.offer("Java");
        pr2.offer("Spring");

        System.out.println(" priority queue vaues  --------   "+ pr2);

        System.out.println("poll value ----- " + pr2.poll());

        System.out.println("all values  ----  "+ pr2);

        System.out.println("peek values  ---------- " + pr2.peek());

        System.out.println("all again  =====  "+ pr2);
        System.out.println("check ==== " + pr2.contains("Java"));
        System.out.println("all "+ pr2);
    }
}
