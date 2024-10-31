import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_14 {
    public static void main(String[] args) throws IOException {
        System.out.println("要跳過第幾次的處理呢?(1~10)"); // Fixed print statement
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // Fixed method call
        int res = Integer.parseInt(str);

        for (int i = 1; i <= 10; i++) { // Fixed loop initialization and increment
            if (i == res) {
                continue; // Skip the iteration if i equals res
            }
            System.out.println("第" + i + "次的處理。"); // Fixed print statement
        }
    }
}
