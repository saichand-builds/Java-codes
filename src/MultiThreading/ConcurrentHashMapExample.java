package MultiThreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    static Map<Integer, String> map = new ConcurrentHashMap<>();

    static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Map size is " + map.size());
    }
}
