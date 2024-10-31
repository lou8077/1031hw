import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入5個分數"); // Changed print method to println

        int[] test = new int[5]; // Correctly declare the array
        for (int i = 0; i < test.length; i++) { // Fixed loop initialization
            String str = br.readLine(); // Fixed method call
            test[i] = Integer.parseInt(str); // Convert input to integer
        }

        // Bubble sort to sort the array in descending order
        for (int s = 0; s < test.length - 1; s++) {
            for (int t = s + 1; t < test.length; t++) {
                if (test[t] > test[s]) { // If current element is greater
                    int tmp = test[t]; // Swap elements
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }

        // Output the sorted scores
        for (int i = 0; i < test.length; i++) { // Fixed loop initialization
            System.out.println("第" + (i + 1) + "名的分數是" + test[i]); // Corrected print statement
        }
    }
}
