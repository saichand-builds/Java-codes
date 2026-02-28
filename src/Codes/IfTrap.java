package Codes;

public class IfTrap {

    static void main(String[] args) {
        int x = 1;

        if (x > 0 | x++ > 1) {
            System.out.println(x);
        }
    }
}
