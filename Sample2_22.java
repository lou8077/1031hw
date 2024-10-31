public class Sample2_22 {
    public static void main(String[] args) {
        int[][] test; // Declare a 2D array
        test = new int[2][5]; // Initialize the array with 2 rows and 5 columns

        // Assign values for the first row (Chinese scores)
        test[0][0] = 80;
        test[0][1] = 60;
        test[0][2] = 22;
        test[0][3] = 50;
        test[0][4] = 75;

        // Assign values for the second row (Math scores)
        test[1][0] = 90;
        test[1][1] = 55;
        test[1][2] = 68;
        test[1][3] = 72;
        test[1][4] = 88; // Added a value for the fifth student in Math

        // Loop to print scores
        for (int i = 0; i < test[0].length; i++) { // Loop through each student's scores
            System.out.println("第" + (i + 1) + "個人的國語分數是" + test[0][i] + "分"); // Print Chinese scores
            System.out.println("第" + (i + 1) + "個人的數學分數是" + test[1][i] + "分"); // Print Math scores
        }
    }
}
