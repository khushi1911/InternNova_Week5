class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number Thread: " + i);
        }
    }
}

class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message Thread: Learning Java Multithreading");
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread();
        MessageThread thread2 = new MessageThread();

        thread1.start();
        thread2.start();
    }
}