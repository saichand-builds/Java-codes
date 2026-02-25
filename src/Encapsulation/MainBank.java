package Encapsulation;

public class MainBank {

    static void main(String[] args) {
        HdfcAccount HA = new HdfcAccount("Sai" , 40000);
        HA.deposit(50000);
        HA.withdraw(30000);
        System.out.println("current balence  is " + HA.AccountBalence);
    }
}

