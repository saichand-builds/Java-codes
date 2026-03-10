package MultiThreading;

// Hashmap is not a thread safe and it will work in single thread

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    static Map<Integer, String> map = new HashMap<>();

    static void main(String[] args) {

        Thread t1 = new Thread(() ->{
        for (int i = 1; i < 1000; i++) {
            map.put(i, "Thread 1");
        }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 2000; i++) {
                map.put(i, "Thread 2");
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
        System.out.println("Map Size " + map.size());
    }

}
