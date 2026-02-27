package Codes;


interface calculator {
    int add(int a, int b);

}


public class LambdaExpression {

    static void main(String[] args) {
        calculator c = (a, b) -> a + b;
        System.out.println(c.add(10,20));

    }
}
