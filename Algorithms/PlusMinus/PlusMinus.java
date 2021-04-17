import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        // setup the size for multiuse var
        float arrSize = arr.length;
        // Set up counter variables for types
        float positiveVals = 0;
        float negativeVals = 0;
        float zeroVals = 0;
        // Go through all of the elements
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] > 0) {
                // add to positive
                positiveVals++;
            } else if (arr[i] < 0) {
                // add to negative
                negativeVals++;
            } else {
                // otherwise zero
                zeroVals++;
            }
        }
        // go through filling floats of percent value
        float positivePer = positiveVals / arrSize;
        float negativePer = negativeVals / arrSize;
        float zeroPer = zeroVals / arrSize;
        // Print the results
        System.out.printf("%.6f\n", positivePer);
        System.out.printf("%.6f\n", negativePer);
        System.out.printf("%.6f", zeroPer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
