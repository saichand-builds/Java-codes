package Codes;

public class Vowels {

    static void main(String[] args) {

        String str = "Saichand";

        String vowels = "aciouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                System.out.println(" " + ch + " " + "Index" + str.indexOf(ch));
            }
        }
    }
}
