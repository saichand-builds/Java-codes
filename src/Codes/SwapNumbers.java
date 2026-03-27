package Codes;

public class SwapNumbers {


    static void main(String[] args) {

        int a=30;
        int b=20;


        System.out.println("value of a is "+a);
        System.out.println("value of a is "+b);

        int temp=a;  // store the value of a in temp;
        a=b;        // Assign value of b to a
        b=temp;     //assigh value of  temp to b

        System.out.println("after "+a);
        System.out.println("Afer "+b);

    }
}
