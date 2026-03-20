package Codes;

public class ReverseString {

    static void main(String[] args) {
        String str="Saichand";
         String rev="";

//         for(int i=str.length()-1; i>=0; i--){
//             rev=rev+str.charAt(i);
//         }
//        System.out.println(rev);

        String rb=new StringBuilder(str).reverse().toString();

        System.out.println(rb);
    }





}
