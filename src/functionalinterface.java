
@FunctionalInterface
interface  add{
    int sum(int a, int b);
}



public class functionalinterface {

    static void main(String[] args) {

        add obj=(a, b) ->a + b;
        System.out.println(obj.sum(10,20));
    }
}
