package class11.junk;

public class Page26 {
    public static int Ex1(int n) {
        if (n == 0) {
            return 0;
        }
        return Ex1(n - 1) + n;
    }

    public static int Ex2(int n) {
        if (n == 1) {
            return 1;
        }
        return Ex2(n - 1) * n;
    }

    public static int Ex3(int n) {
        if (n % 2 == 0) {
            n -= 1;
        }
        if (n == 1) {
            return 1;
        }
        return Ex3(n - 2) * n;
    }

    public static int Ex4(int n) {
        if (n < 10) {
            return 1;
        }
        return Ex4(n / 10) + 1;
    }

    public static double Ex5(int n1, int n2) {
        if (n1 < n2) {
            return 0;
        }
        return Ex5(n1 - n2, n2) + 1;
    }

    public static double Ex6(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        }
        return Ex6(n1 - n2, n2);
    }

    public static boolean Ex7(int x, int y) {
        if (y == 0) {
            return true;
        } else if (y < 0) {
            return false;
        }
        return Ex7(x, y - x);
    }

    public static boolean Ex8(int n, int x) {
        if (x == 1) {
            return true;
        }
        if (n % x == 0 && n != x) {
            return false;
        }
        return Ex8(n, x - 1);
    }

    public static boolean Ex9(int n) {
        if (n < 10) {
            return true;
        }
        if (n%10%2 == n/10%2) {
            return Ex9(n/10);
        } else {
            return false;
        }
    }
}

