package ArrayOperations;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
    int [] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
    Arrays.sort(numbers);
    System.out.println("Sorted array: " +Arrays.toString(numbers));
}}
