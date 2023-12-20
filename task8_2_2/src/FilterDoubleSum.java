
//You are given a list of integers. Your task is to perform the following operations using Java functional programming techniques:
//Filter out all the even numbers from the list.
// Double each remaining number.
// Find the sum of the resulting numbers.

import java.util.Arrays;
import java.util.List;

public class FilterDoubleSum {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        System.out.println("Sum of filtered and doubled numbers is " +
                numbers.stream()
                    .filter(number -> number % 2 != 0)
                    .mapToDouble(number -> number * 2.0)
                    .sum()
        );
    }
}
