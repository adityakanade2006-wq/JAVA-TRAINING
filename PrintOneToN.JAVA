 public class PrintOneToN {

    static void printNumbers(int n) {
        if (n == 0) {
            return; // base case
        }

        printNumbers(n - 1); // recursive call
        System.out.println(n); // print after returning
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}