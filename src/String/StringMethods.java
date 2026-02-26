package String;

public class StringMethods {
    static void main(String[] args) {

        String str = "Hello world";
        String str2 = "Sai";
        String str3 = "Harshi";

        System.out.println(str.isEmpty());  // False
        System.out.println("".isEmpty());   // True
        System.out.println(str.length());    // include the space
        System.out.println(str);
        System.out.println(str.equals(str2));   // false
        System.out.println(str.equals("Hello world"));   // true
        System.out.println(str2.compareTo(str3));
    }
}
