package Codes;

public class Ifcondition {

    static void main(String[] args) {

        for (int i=1; i<=3; i++){

            for(int j=1; j<= 3; j++){
/*
                i = 1
                j = 1
                Condition: (i == 2 && j == 2) → false
                i == j → 1 == 1 → true
                So break (exits inner loop immediately)
                → No output for i=1.

                */

                if(i==2 && j == 2 || i==j){
                    break;
                }

                System.out.print(" / "+(i+j));
            }
        }
    }
}
