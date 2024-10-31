import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 修正 parseint 為 parseInt
        if (num == 1) { // 修正條件判斷運算符為 ==
            System.out.println("輸入的是1");
        } else {
            System.out.println("選擇的是1以外的數字");
        }
    }
}
