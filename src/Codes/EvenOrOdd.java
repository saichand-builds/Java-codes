package Codes;

import java.util.Scanner;

public class EvenOrOdd {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n  + "  Number is Even");
        } else {
            System.out.println(n + "   Number is Odd");
        }
    }
}
