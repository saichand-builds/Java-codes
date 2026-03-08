package Codes;

import java.util.Scanner;

public class PrimeNumbers {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("prime Numbers from 1 to " + n);

        for (int i = 1; i < n; i++) {

            boolean isprime=true;

            for(int j=2; j<i; j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(" "+i);
            }

        }
    }
}
