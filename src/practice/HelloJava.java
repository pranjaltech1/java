package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloJava  {
    public static void main(String[] args) {


        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"viha");
        map.put(2,"sham");
        map.put(3,"avni");
        map.containsKey(2);
        System.out.println(map);





        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(40);

        //comparator
        System.out.println(list.get(0));
        list.sort((a, b)->a-b);
        System.out.println(list);
        list.sort((a,b)->b-a);
        System.out.println(list);












   /* BankAccount sbi = new BankAccount();        // one shared account

    Runnable task = new Runnable() {
        @Override
        public void run() {
            sbi.withdraw(50);                   // both will try to take ₹50
        }
    };

    Thread t1 = new Thread(task, "Thread 1");
    Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
*/



}
}