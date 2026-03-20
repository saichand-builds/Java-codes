package Codes;

public class StaticEx {

    static  final int price;
    static {
        price=100;

    }

    static void main(String[] args) {

        System.out.println(StaticEx.price);
        System.out.println(price);
    }
}
