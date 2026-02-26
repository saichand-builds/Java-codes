package String;

public class BytetoAscii {
    static void main(String[] args) {

        byte[] b = {97, 98, 99,100};
        // create a Object by copying the Given byte [] numbers
        // by converting them into ASCII Charaters
        String s9 = new String(b);
        System.out.println(s9);
    }
}
