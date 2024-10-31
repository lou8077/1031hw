public class Sample2_10 {
    public static void main(String[] args) {
        int i = 1; // Fixed 'inti' to 'int'
        while (i <= 5) { // Added braces to the while loop
            System.out.println("第" + i + "次的迴圈"); // Fixed the print method
            i++; // Increment 'i' to avoid an infinite loop
        }
        System.out.println("迴圈結束"); // Fixed the print method
    }
}

