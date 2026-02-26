package String;

public class Charoffset {

    static void main(String[] args) {

        char []ch={'a','b','c','d','f','g','j'};
        // create a String object given count number of charaters from the offset in char[]
          String s9=new String(ch,2,4);
        System.out.println(s9);
    }
}

