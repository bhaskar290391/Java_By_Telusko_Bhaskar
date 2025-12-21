package Thread;

class DataCounter {

    int counter;

    public synchronized void counterData() {
        counter++;
    }
}

public class RaceCondtion {
    public static void main(String[] args) throws InterruptedException {

        DataCounter data = new DataCounter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                data.counterData();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                data.counterData();
            }
        };

        Thread t1 = new Thread(obj2);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The counter Data is " + data.counter);
    }
}
