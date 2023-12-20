//Calculate mean of an array in functional way (e.g. no for-loops)

import java.util.Arrays;
public class MeanOfArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    double mean = Arrays.stream(numbers)
    .mapToDouble(a -> a)
    .average()
    .orElse(0.0);
    System.out.println("Mean is " + mean);
    }
}
