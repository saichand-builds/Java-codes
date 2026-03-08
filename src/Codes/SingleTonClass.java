package Codes;


class Singleton {

  // 1. This variable stores the single object of the class.
    // 2. static is class level. Not to the Object
    //3. instance Initial value is null
    private static Singleton instance;

    // 1. Private Constructor

    //2. That means no other class can create the object using new.

    private Singleton() {
        System.out.println("Object is created");
    }

    //3️⃣ Public Static Method

    // This method gives global access to the single object.

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingleTonClass {
    static void main(String[] args) {
            // 1. First Call to getInstance()

        Singleton s1= Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
