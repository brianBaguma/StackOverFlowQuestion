package edu.miu;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static class SortedArrayProcessing {

            // Function to process array
            public static void processArray(int[] arr) {
                for (int value : arr) {
                    // Example operation
                    if (value > 10) {
                        // Do something
                        System.out.println(value);
                    }
                }
            }

            public static void main(String[] args) {
                int[] unsorted = {5, 3, 8, 6, 2, 7, 4, 1, 9, 0};
                int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
                Arrays.sort(sorted);

                long startTime, endTime;

                // Process unsorted array
                startTime = System.nanoTime();
                processArray(unsorted);
                endTime = System.nanoTime();
                double unsortedTime = (endTime - startTime) / 1e6; // Convert to milliseconds

                // Process sorted array
                startTime = System.nanoTime();
                processArray(sorted);
                endTime = System.nanoTime();
                double sortedTime = (endTime - startTime) / 1e6; // Convert to milliseconds

                System.out.println("Time taken for unsorted array: " + unsortedTime + " ms");
                System.out.println("Time taken for sorted array: " + sortedTime + " ms");
            }
        }
    }
