public class ArrayExample {
    public static void main(String[] args) {
        // Create and initialize the array
        int[] array = {1, 1, 2, 3, 5, 8};

        System.out.println("All values in the array:");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.println(value);
        }