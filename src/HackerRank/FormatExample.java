package HackerRank;

import java.util.Scanner;

public class FormatExample {

    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("==========================");
        for (int i=0; i<3; i++){
            String s=sc.next();
            int  I=sc.nextInt();

            System.out.printf("%-15s%03d\n", s,I);
        }
        System.out.println("=============================");
    }
}
