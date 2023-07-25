public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;

        System.out.println("Fibonacci utilizando recursão:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib1(i) + " ");
        }

        System.out.println("\n\nFibonacci utilizando laço for:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib2(i) + " ");
        }

        System.out.println("\n\nFibonacci utilizando laço while:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib3(i) + " ");
        }
    }

    // Método recursivo para calcular Fibonacci
    public static int fib1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    // Método usando laço for para calcular Fibonacci
    public static int fib2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Método usando laço while para calcular Fibonacci
    public static int fib3(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev = 0;
        int curr = 1;
        int i = 2;
        while (i <= n) {
            int next = prev + curr;
            prev = curr;
            curr = next;
            i++;
        }
        return curr;
    }
}
