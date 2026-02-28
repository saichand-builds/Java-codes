package Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {
    static void main(String[] args) {

        List<Integer> Marks = Arrays.asList(23, 45, 6, 4, 33, 67, 23, 66, 55, 31, 22, 74);

        int marksFrequency = Collections.frequency(Marks, 45);

        System.out.println(marksFrequency);
    }
}
