package Codes;

import java.util.Scanner;

public class NumberPrime {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean isprime=true;

        for( int  i=2; i<n; i++){

            if(n%i==0) {
                isprime = false;
                break;
            }
        }
        if(isprime && n>1){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}