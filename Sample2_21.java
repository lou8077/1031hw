import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入5個人的分數"); // Prompt for input

        Integer[] test = new Integer[5]; // Use Integer array to support Collections.reverseOrder()

        for (int i = 0; i < test.length; i++) { // Correct loop initialization
            String str = br.readLine(); // Read user input
            test[i] = Integer.parseInt(str); // Parse input to Integer
        }

        // Sort the array in descending order
        Arrays.sort(test, Collections.reverseOrder());

        // Output the sorted scores
        for (int i = 0; i < test.length; i++) { // Correct loop initialization
            System.out.println("第" + (i + 1) + "名的分數是" + test[i]); // Corrected print statement
        }
    }
}
