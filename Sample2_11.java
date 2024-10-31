public class Sample2_11 {
    public static void main(String[] args) {
        int i = 1; // Fixed 'inti' to 'int'
        do {
            System.out.println("第" + i + "次的迴圈"); // Fixed the print method and added braces
            i++; // Increment 'i' to avoid an infinite loop
        } while (i <= 5); // Fixed the condition in the while statement
        System.out.println("迴圈結束"); // Fixed the print method
    }
}
