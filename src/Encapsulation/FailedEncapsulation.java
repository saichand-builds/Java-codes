package Encapsulation;

public class FailedEncapsulation {
    static void main(String[] args) {

        Account ac= new Account();
        ac.AccoutHolderName="Sai";
        ac.Balence=-70000;   //  negivitve values allowing
                            // Novalidation
                            // No retrict

        System.out.println(ac.Balence);
    }
}
