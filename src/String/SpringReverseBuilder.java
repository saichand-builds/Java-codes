package String;

public class SpringReverseBuilder {

    static void main(String[] args) {
        System.out.println(ReverseStringWord("Hello how are you"));
    }

    public static String ReverseStringWord(String s) {

        String[] StringWord = s.split(" ");
        int noOfWords = StringWord.length;

        StringBuilder resultString = new StringBuilder();
        for (int i = noOfWords - 1; i >= 0; i--) {
            resultString.append(StringWord[i]);
            resultString.append("");

        }
        return resultString.toString().trim();
    }
}
