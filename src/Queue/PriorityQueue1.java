

package Queue;
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> qQueue= new PriorityQueue<Integer>();
        qQueue.offer(21);
        qQueue.offer(17);
        qQueue.offer(37);
        qQueue.offer(41);
        qQueue.offer(9);
        qQueue.offer(67);
        qQueue.offer(31);
       
        System.out.println("traverse");
        Iterator itr = qQueue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
