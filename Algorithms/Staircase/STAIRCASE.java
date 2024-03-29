import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        
        // amount of levels to print
        for (int i = n; i > 0; i--) {
            // incramentor - accessed by multi. for loops
            int j = 0;
            // amount of spaces to print
            for (j = 0; j < i - 1; j++) {
                System.out.print(' ');
            }
            // the amount of # to print
            for (int k = j + 1; k <= n; k++) {
                System.out.print("#");
            }
            // print new line
            System.out.println();
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
