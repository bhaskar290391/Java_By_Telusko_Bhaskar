package Thread;

class C extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class D extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class ThreadPrioritySleep {

    public static void main(String args[]) throws InterruptedException {
        C obj = new C();
        D obj1 = new D();
        obj.start();
        Thread.sleep(5);
        obj1.start();
    }
}