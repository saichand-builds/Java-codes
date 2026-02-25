public class Test {

    static void print(int x) {
        System.out.println("Int");
    }

    static void print(Integer x) {

        System.out.println("Integer");
    }

    static void main(String[] args) {

        int x = 10;
        print(x);
    }
}
