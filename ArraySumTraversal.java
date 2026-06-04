 public class ArraySumTraversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;                                                                                                      

        // Array traversal
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum); 
    }
}  g