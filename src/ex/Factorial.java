package ex;

public class Factorial {

    public static void main(String[] args) {
        a();
        //System.out.println("factorial(10) = " + factorial(100000));
        System.out.println("factorialForCycle(100000) = " + factorialForCycle(12));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialForCycle(int n) {
        int res = 1;
        for (int i = 1; i< n; i++) {
            res *= i;
        }
        return res;
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        System.out.println("abc");
    }
}
