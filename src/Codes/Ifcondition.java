package Codes;

public class Ifcondition {

    static void main(String[] args) {

        for (int i=1; i<=3; i++){

            for(int j=1; j<= 3; j++){

                if(i==2 && j == 2 || i==j){
                    break;
                }
                System.out.print(i+j);
            }
        }
    }
}
