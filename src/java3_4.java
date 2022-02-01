public class java3_4 {
    public static void main(String args[]) {
        int a = 200, n, p;
        n = 0;
        p = 1;
        while (a>p) {
            n = n + 1;
            p = p * 2;
        }
        System.out.println("Result = " + n); // Result = 8. Why ??
    }
}

class While2 {
    public static void main(String args[]) {
        int v = 120, y, k;
        y = 10;
        k = 0;
        while (v>y) {
            v = v - y;
            y = y + 10;
            k = k + 1;
        }
        System.out.println("Result = " + k); // Result = 0. Why ??
    }
}

class java3_4_A {
    public static void main(String args[]) {
        int a = 200, n, p;
        n = 0;
        p = 1;
        while (a>p) {
            n = n + 1;
            p = p * 2;
        }
        System.out.println("Result = " + n); // Result = 8. Why ??
    }
}

