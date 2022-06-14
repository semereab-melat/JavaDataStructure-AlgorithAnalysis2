
import java.util.Arrays;
import java.util.Random;

/***************************************************************
 * Filename: Created by: melat Created on: 18/02/2022 Comment:
 ***************************************************************/
public class Main {
  public static void main(String[] args) {

    long start, end, execution;
    Random rand = new Random(0);
    int[] numbers = new int[10];
    // for unsorted array
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(10) + 1;
    }

    // get the start time
    start = System.currentTimeMillis();
    System.out.println("\nUnsorted array output");
    System.out.println(unsortedMaxMin(numbers));
    // get the end time
    end = System.currentTimeMillis();
    // call the method
    execution = (end - start);
    System.out.println("Execution time for unsorted array:  " + execution + " milliseconds");

    // for sorted arrays
    System.out.println("\nSorted array output");
    Arrays.sort(numbers);
    start = System.currentTimeMillis();
    System.out.println(sortedMaxMin(numbers));
    // get the end time
    end = System.currentTimeMillis();
    // call the method
    execution = (end - start);
    System.out.println("Execution time for sorted array: " + execution + " milliseconds");

    duplicatedNumbers(numbers);

  }

  private static String unsortedMaxMin(int[] array) {
    int max = array[0];
    int min = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    return "Maximum: " + max + "\nMinimum: " + min + "\nThe difference between Maximum and Minimum: " + (max - min); // 1
  }

  private static String sortedMaxMin(int[] array) {
    return "Maximum: " + array[array.length - 1] + "\nMinimum: " + array[0]
        + "\nThe difference between Maximum and Minimum: " + (array[array.length - 1] - array[0]);
  }

  private static void duplicatedNumbers(int[] array) {
    int count = 0; // 1
    for (int i = 0; i < array.length; i++) { // N + 1 or O(n)
      for (int j = i + 1; j < array.length; j++) { // N*N or O(n^2)
        if (array[i] == array[j]) { // N*N or O(n^2)
          // System.out.print(array[i] + " ");
          count++;// N*N or O(n^2)
        }
      }
    }
    System.out.println("\nThere are " + count + " duplicated numbers"); // 1
  }
}
