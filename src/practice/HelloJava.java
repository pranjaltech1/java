package practice;

public class HelloJava  {
    public static void main(String[] args) {
    BankAccount sbi = new BankAccount();        // one shared account

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
}
}