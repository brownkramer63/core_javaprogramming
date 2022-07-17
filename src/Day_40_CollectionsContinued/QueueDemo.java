package Day_40_CollectionsContinued;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer>  queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,20,30,400));
        queue1.addAll(Arrays.asList(10,20,30,400));
        queue1.addAll(Arrays.asList(10,20,30,400));

        System.out.println(queue1);

        queue1.poll();
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
        queue1.poll();

        System.out.println(queue1);


        Queue<Integer>  queue2 = new ArrayDeque<>();
        Queue<Integer>  queue3 = new LinkedList<>();

        System.out.println("-------------------");

        List<Integer> list = new LinkedList<>();







    }
}
