import java.util.Arrays;
import java.util.Random;

/**
 * SerialVsParallelSortDemo
 */
public class SerialVsParallelSortDemo {
    public static void main(String[] args) {
        int[] arraySizes = { 10000, 100000, 1000000, 10000000 };

        for (int arraySize : arraySizes) {
            System.out.println("When Array Size is : " + arraySize);

            int[] arr = new int[arraySize];
            Random random = new Random();

            for (int i = 0; i < arraySize; i++) {
                arr[i] = random.nextInt(arraySize);
            }

            int[] sequentialArr = Arrays.copyOf(arr, arr.length);
            int[] parallelArr = Arrays.copyOf(arr, arr.length);

            long startTime = System.currentTimeMillis();
            Arrays.sort(sequentialArr);
            long endTime = System.currentTimeMillis();

            System.out.println("Time taken for Serial Sort in Milli Seconds : " + (endTime - startTime));

            startTime = System.currentTimeMillis();
            Arrays.parallelSort(parallelArr);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken for Parallel Sort in Milli Seconds : " + (endTime - startTime));
            System.out.println("---------------------------------------------------------");
        }
    }
}