import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 修正 parseInt 語法
        if (num == 1) { // 修正條件判斷運算符為 ==
            System.out.println("輸入的是1");
        } else if (num == 2) {
            System.out.println("輸入的是2");
        } else {
            System.out.println("請輸入1或2");
        }
    }
}
