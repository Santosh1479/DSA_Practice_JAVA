import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        // sum
        System.out.println("ur n?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(1, n, 0);

        // factorial
        System.out.println("ur n?");
        n = sc.nextInt();
        int s = factorial(n);
        System.out.println(s);

        // power
        System.out.println("power of what no?");
        int x = sc.nextInt();
        int p = power(x, n);
        System.out.println(p);

        // fibonacci
        System.out.println("ur n?");
        n = sc.nextInt();
        int fib1 = 0, fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        fibonacci(n - 2, 0, 1);

    }

    // // summ on n

    public static void sum(int i, int n, int suum) {
        if (i == n) {
            suum += i;
            System.out.println(suum);
            return;
        }
        suum += i;
        sum(i + 1, n, suum);
    }

    // factorial

    public static int factorial(int p) {
        int fact = 0;
        if (p == 1 || p == 0) {
            return 1;
        }
        fact = p * factorial(p - 1);
        return fact;
    }

    /// fibonacci

    public static void fibonacci(int a, int b, int c) {
        if (a == 0) {
            return;
        }
        int fib = b + c;
        System.out.println(fib);
        fibonacci(a - 1, c, fib);
    }

    // power
    // public static int power(int x, int n) {
    // if(x==0){
    // return 0;
    // }
    // if (n == 0) {
    // return 1;
    // }
    // int ss = x * power(x, n - 1);
    // return ss;
    // }

    public static int power(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return  power(x, n / 2) * power(x, n / 2);
        } else {
            return  power(x, n / 2) * power(x, n / 2) * x;

        }
    }

}
