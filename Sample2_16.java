import java.lang.reflect.Array;

public class Sample2_16 {
    public static void main(String[] args) {
        // Create an array of integers with a length of 3
        int[] intArray = (int[]) Array.newInstance(int.class, 3);

        // Set values in the array
        Array.set(intArray, 0, 123);
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);

        // Retrieve and print values from the array
        System.out.println("intArray[0] = " + Array.get(intArray, 0)); // Fixed index from O to 0
        System.out.println("intArray[1] = " + Array.get(intArray, 1)); // Fixed syntax and method calls
        System.out.println("intArray[2] = " + Array.get(intArray, 2)); // Fixed syntax and method calls
    }
}
