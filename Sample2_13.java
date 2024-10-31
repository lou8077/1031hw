import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_13 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)"); // Fixed print statement
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // Fixed method call
        int res = Integer.parseInt(str);

        for (int i = 1; i <= 10; i++) { // Fixed increment and braces
            System.out.println("第" + i + "次的處理。"); // Fixed print statement
            if (i == res) {
                break; // Correctly formatted break statement
            }
        }

        System.out.println("處理結束。"); // Added a final statement
    }
}
