import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuePractice {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Angular");
        deque.addLast("React");
        deque.add("Java");
        deque.add("Spring boot");

        System.out.println(" show after fi ----> "+ deque);

        System.out.println("peekfirst value -------  "+ deque.peekFirst());

        System.out.println("peek last value  ---------- "+deque.peekLast());

        System.out.println("only peek   ------- "+ deque.peek());

        deque.removeFirst();
        System.out.println("after remove first   ====" + deque);
        deque.removeLast();
        System.out.println("remove last    ------ "+ deque);


    }
}