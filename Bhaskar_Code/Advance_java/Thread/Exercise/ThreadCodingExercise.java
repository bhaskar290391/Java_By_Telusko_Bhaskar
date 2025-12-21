package Thread.Exercise;

/*

Create a Java program that launches two threads, each printing a simple message five times.

You need to:

Create a class PrinterTask that implements Runnable.

In the run() method, print:

[Thread-Name]: Running task i
for i = 1 to 5.

In the main() method:

Instantiate PrinterTask once.

Create two Thread objects using this task, named "Worker-1" and "Worker-2".

Start both threads.

Use .join() to ensure the main thread waits for both to finish.

Expected Output (order may vary):

  Worker-1: Running task 1 

  Worker-2: Running task 1 

  Worker-1: Running task 2 

  Worker-2: Running task 2 

*/

class PrinterTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }

}

public class ThreadCodingExercise {
    public static void main(String[] args) throws InterruptedException {

        PrinterTask printerTask = new PrinterTask();

        Thread t1 = new Thread(printerTask, "Worker-1");
        Thread t2 = new Thread(printerTask, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
