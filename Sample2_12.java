public class Sample2_12 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) { // Changed 'O' to '0' and fixed increment syntax
            for (j = 0; j < 3; j++) { // Fixed the increment and parentheses
                System.out.println("i圈" + i+"j圈" + j); // Fixed the print method and removed extra '+' signs
            }
        }
    }
}
