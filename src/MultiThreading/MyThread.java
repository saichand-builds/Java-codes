package MultiThreading;

public class MyThread extends Thread {

        // Override the run method
    @Override
    public void run() {
        super.run();

        System.out.println("Run");
    }

    static void main(String[] args) {
        System.out.println("Main");

        //Thread class Object
        MyThread thread = new MyThread();
        // Start Method
        thread.start();

    }
}
