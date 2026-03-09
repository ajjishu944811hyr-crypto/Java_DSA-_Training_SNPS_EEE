package Home.basics.threads;

public class DeadlockDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            synchronized (accountA) {
                System.out.println("Thread 1 locked Account A");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB) {
                    System.out.println("Thread 1 locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() ->{
        synchronized (accountB) {
            System.out.println("Thread 2 locked Account B");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            synchronized (accountA) {
                System.out.println("Thread 2 locked Account A");
            }
        }
        });
        t1.start();
        t2.start();
    }
}

/*
ℹ️ points to remeber
⭐ Thread 1 acquires a lock on Account A and the sleeps,giving
⭐ Thread 2 time to acquire a lock on Account B.
⭐ Thread 1 waits for Account A & Thread 2 waits for Account B.
⭐ Since neither thread relases the lock , both keep waiting for each other creating a DEADLOCK ❌ Situation
⭐ Deadlock Explanation: Deadlock occurs when thread is holdiing  a resource and waiting for other thread to release it.
⭐ when deadlock occurs , it will not destroy the app , it will freeze it permanemtly
⭐how to reslove deadlock -> Write better code
⭐
 */
