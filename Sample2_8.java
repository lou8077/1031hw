import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_8 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問要選哪條路線?");
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 修正 readLine 語法
        int res = Integer.parseInt(str); // 修正 parseInt 語法
        char ans = (res == 1) ? 'A' : 'B'; // 修正條件運算式語法

        System.out.println("選擇了" + ans + "路線"); // 修正輸出語句
    }
}
