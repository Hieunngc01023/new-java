

package LinkedList;

import java.util.LinkedList;
import java.util.Vector;


public class Method {
    private static void insert(){
        // bài toán cung cấp các phương thức để insert new element
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.offer(2);
        list.addFirst(0);
        list.addLast(4);
        list.offerFirst(0);
        list.offerLast(5);
        for(int i :list)
            System.out.println(i);
        System.out.println("=====================");
    }
    private static void remove(){
        LinkedList<Integer> list = new LinkedList<>();
         list.add(1);
        list.offer(2);
        list.addFirst(0);
        list.addLast(4);
        list.offerFirst(0);
        list.offerLast(5);
        // remove
        list.poll();// remove first
        list.pollFirst();
        list.pollLast();
        list.removeFirst();
        list.removeLast();
        for(int i : list)
            System.out.println(i);
        System.out.println("++++++++++++++++++++++++++");
    }
    private static void retrieve(){
        LinkedList<Integer> list = new LinkedList<>();
         list.add(1);
        list.offer(2);
        list.addFirst(0);
        list.addLast(4);
        list.offerFirst(0);
        list.offerLast(5);
        System.out.println(list.element()); // lấy ra phần tử đầu tiên.
        System.out.println(list.peek()); // lấy ra phần tử đầu tiên.
        System.out.println(list.peekFirst()); // 
        System.out.println(list.peekLast()); // lấy ra phần tử cuối cùng.
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
    public static void main(String[] args) {
        insert();
        remove();
        retrieve();
    }
}
