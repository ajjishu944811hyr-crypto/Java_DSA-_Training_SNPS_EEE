package Home.basics.threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction.");
    }

    public static void main(String[] args) {
        ATMTransaction tx = new ATMTransaction();
        System.out.println("Thread State: " +
                tx.getState());  // NEW --> object Created
        tx.start();
        System.out.println("Thread State: " + tx.getState()); // RUNNABLE
    }
}
/*
🔵Explanination:

⭐ Initially Thread is  in the NEW state
⭐ After calling start() ,it moves to the RUNNABLE state, and it execute the the run() method
⭐ The exact timming of the state change will depend on the JVM Schedular

ℹ️ points to rememmber:
⭐ Threads is create only once
⭐ start() changes the state
⭐Thread cannot be a restarted
⭐ final state is DEAD or TERMINATE

🟨 Bullet points for interviews / Placements
🔵 A thread can be creating by extending the Thread class and overriding the run() method
🔵 run() contains the task()
🔵 start() creats a new thread
🔵 calling run() directly (❌ No MultiThreading)
🔵


 */
