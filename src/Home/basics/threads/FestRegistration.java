package Home.basics.threads;

public class FestRegistration {
    //Form Fill Up
    static class Formfilling extends Thread{
        public void run() {
            System.out.println("Form Filling Started.");
        }
    }
    //Upload Documents
    static class DocumentsUpload extends Thread{
        public void run() {
            System.out.println("Document Upload Started.");
        }
    }
    //Email Notification
    static class EmailNotification extends  Thread{
        public void run() {
            System.out.println("Email Notification is sent.");
        }
    }

    public static void main(String[] args) {
        Formfilling t1 = new Formfilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }

}
/*
⭐ Java program starts with one main Thread
⭐ Thread allow "parallel exceution" --> Concurrency
⭐ Output order is never guaranteed
⭐ Threads shared the same memory
⭐ Improves the porformance and responsiveness
⭐ when start() is called , the JVM creat's the new Thread
⭐ when the run() is called directly, there no concurrency
ℹ️ process Vs Thread
⭐ Process is a running program
⭐ Thread is a path of execution inside the program
⭐ a process as its own memomry
⭐ Thread share the same memory
⭐ Creating the Thread is cheaper than creating the process
🔵Example:
⭐ Process --> Google Chrome Browser; Thread --> New Tab of Chrome
⭐ closing a tab will not close chrome or will not kill chrome
⭐⭐⭐
 */
