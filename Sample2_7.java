import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問你是男生嗎?");
        System.out.println("請輸入Y或N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 修正 readLine 語法
        char letter = str.charAt(0); // 修正 charAt 的參數

        if (letter == 'Y' || letter == 'y') { // 修正條件判斷運算符
            System.out.println("你是男生阿!");
        } else if (letter == 'N' || letter == 'n') { // 修正條件判斷運算符
            System.out.println("你是女生阿!");
        } else {
            System.out.println("請輸入Y或N"); // 處理其他輸入情況
        }
    }
}
