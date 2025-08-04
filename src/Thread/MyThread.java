package Thread;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
