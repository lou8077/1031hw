public class Sample2_17 {
    public static void main(String[] args) {
        int[] test; // Declare the array
        test = new int[5]; // Initialize the array with size 5

        // Initialize the array values
        test[0] = 80;
        test[1] = 60; // Fixed syntax error here
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        // The following line would cause an ArrayIndexOutOfBoundsException
        // test[10] = 75; // Uncommenting this line will cause an error

        // Loop to print the scores
        for (int i = 0; i < 5; i++) { // Fixed the increment syntax
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分"); // Fixed the print statement
        }
    }
}
