package ArrayOperations;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12, 3, 5};
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        int[] result = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
