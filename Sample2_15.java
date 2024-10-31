public class Sample2_15 {
    public static void main(String[] args) {
        int[] test = new int[5]; // Corrected array declaration
        test[0] = 80;
        test[1] = 60; // Initialize array values
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        // Optional: You can also initialize the array in one line
        // int[] test = {80, 60, 22, 50, 75};

        for (int i = 0; i < 5; i++) { // Fixed loop initialization
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分"); // Fixed print statement
        }
    }
}
