import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered odd numbers: " + oddNumbers);

        List<Integer> doubledOddNumbers = oddNumbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled odd numbers: " + doubledOddNumbers);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of all numbers: " + sum);
    }
}
