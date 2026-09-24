public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins CI!");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("5! = " + factorial(5));

        if (add(2, 3) != 5 || factorial(5) != 120) {
            System.out.println("Self-check FAILED");
            System.exit(1);
        }
        System.out.println("Self-check passed");
    }
}
