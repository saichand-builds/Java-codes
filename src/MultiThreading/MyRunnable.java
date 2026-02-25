package MultiThreading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method");
    }

    static void main(String[] args) {
        System.out.println("Main");
        MyRunnable Rm = new MyRunnable();
        Thread td = new Thread(Rm);
        td.start();

    }

}
