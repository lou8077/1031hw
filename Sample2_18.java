public class Sample2_18 {
    public static void main(String[] args) {
        // Correctly initialize the array using curly braces
        int[] test = {80, 60, 22, 50, 75}; // Array initialization

        // Loop through the array to print the scores
        for (int i = 0; i < 5; i++) { // Fixed increment syntax
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分"); // Fixed print statement
        }
    }
}
