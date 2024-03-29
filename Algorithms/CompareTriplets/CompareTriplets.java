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

public class CompareTripletsSolution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<Integer>(Arrays.asList(0,0));
        int temp = 0;
        
        for (int i = 0; i < a.size(); i++) {
            int result = a.get(i).compareTo(b.get(i));
            if (result > 0) {
                temp = score.get(0) + 1;
                score.set(0, temp);
            } else if (result < 0) {
                temp = score.get(1) + 1;
                score.set(1, temp);
            }
        }
        return score;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
