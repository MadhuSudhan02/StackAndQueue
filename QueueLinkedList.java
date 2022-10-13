import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queueList = new LinkedList<>();
        queueList.offer(35);
        queueList.offer(45);
        queueList.offer(89);
        queueList.offer(90);
        System.out.println(queueList);
        queueList.poll();
        System.out.println(queueList);
    }

}
