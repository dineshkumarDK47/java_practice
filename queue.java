import java.util.*;
//java queue - collection framework 


public class queue {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        // //also we can use PriorityQueue amd ArrayDequeue
        // q.add(12);
        // q.offer(4);
        // q.offer(7);
        // System.out.println(q);
        // int ele=q.peek();
        // System.out.println(ele);
        // int ele1=q.poll();
        // System.out.println(ele1);
        // System.out.println(q);
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(12);
        d.addLast(4);
        d.addFirst(7);
        int ele=d.getFirst();
         System.out.println(ele);
        System.out.println(d);
    }
}
