package HackerRank;

import java.util.Scanner;

public class SumPattern {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter the numbers");
        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();

            int sum=a;

            for(int j=0; j<n; j++){
                sum=sum+(1<<j)*b;
                System.out.print("Sum "+sum);
            }
            System.out.println();
        }
        sc.close();
    }
}
