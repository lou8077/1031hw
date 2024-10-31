public class Sample2_19 {
    public static void main(String[] args) {
        // Correctly initialize the array using curly braces
        int[] test = {80, 60, 22, 50, 75}; // Array initialization

        // Output the elements of the array
        for (int i = 0; i < test.length; i++) { // Fixed loop initialization
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分"); // Fixed print statement
        }

        // Output the number of students (elements in the array)
        System.out.println("考試人數為" + test.length + ""); // Fixed print statement
    }
}
