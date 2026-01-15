package practice;
import java.util.*;

import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class CollectionsPrac {



    public class HelloJavaa {
         {
            System.out.println("LIst-ordered collection,allows duplicates " +
                    "ArrayList,Linked List,Vector,Stack");
            Runnable task1 = new practice.MyRunnable("Task-A");
            Runnable task2 = new practice.MyRunnable("Task-B");

            Thread t1 = new Thread(task1);
            Thread t2 = new Thread(task2);

            t1.start();
            t2.start();

            System.out.println("ArrayList");
            List <Integer> list =new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(5,70);
            System.out.println(list);
            System.out.println(list.contains(40));
            System.out.println(list.indexOf(20));
            System.out.println(list.remove(2));
            System.out.println(list.get(1));
            list.set(4,80);
            System.out.println(list.size());
            System.out.println(list);


            System.out.println("Linked List-implements list and deque interface" +
                    "alows elements to be added or deleted from both ends");

            List <Integer> list2=new LinkedList<>();
            list2.add(10);
            list2.add(1,20);


            System.out.println(list2);


            Vector<String> vector = new Vector<>();
            vector.add("Dog");
            vector.add("Cat");
            vector.add("Rabbit");

            System.out.println("Vector Elements: " + vector);
            vector.remove(1);
            System.out.println("After removal: " + vector);

            System.out.println("Stack -Lifo -push,pop,peek");
            Stack<String> stack =new Stack<>();
            stack.push("apple");
            stack.push("banana");
            stack.push("mango");
            stack.push("chickoo");
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack);

            System.out.println("queue=FIFO" +
                    "offer,poll, peek or add,remove,element");
            System.out.println("priority queue- elements are ordered based on priority");
            Queue<Integer> q=new PriorityQueue<>();
            q.offer(50);
            q.offer(20);
            q.offer(70);
            System.out.println(q);
            System.out.println(q.peek());

            System.out.println("set interface-" +
                    "uniue,no ordered ,hashset,treeset,linkedhashset");


            ArrayList<Integer> list3=new ArrayList<>();
            list3.add(23);
            list3.add(36);
            list3.add(76);
            list3.set(2,75);
            System.out.println(list3);


        }
    }


    class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
