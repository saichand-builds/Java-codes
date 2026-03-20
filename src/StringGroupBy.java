import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringGroupBy {

    static void main(String[] args) {

        List<String> list= Arrays.asList("Sai","harshi","Shafi");

        String result=list.stream()
//                .collect(Collectors.joining(" ,"));
        .collect(Collectors.joining("," ,"[","]"));
        System.out.println(result);
    }
}
