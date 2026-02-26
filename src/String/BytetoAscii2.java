package String;

public class BytetoAscii2 {
    static void main(String[] args) {

        byte[] b = {97, 98, 99, 100, 101};
        // create a new Object with count  number of bytes from the offset in the byte[]
        String s10 = new String(b, 1, 3);
        System.out.println(s10);
    }
}
