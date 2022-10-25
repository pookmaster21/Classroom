public class HW {
    public static int Ex14(int[] arr, int i) {
        if (i == 0) {
            return 0;
        } else {
            return arr[i] + Ex14(arr, i - 1);
        }
    }

    public static boolean Ex17(int[] arr, int i) {
        if (i == 0) {
            return true;
        } else {
            return ((arr[i] > arr[i - 1]) && (Ex17(arr, i - 1)));
        }
    }

    public static boolean Ex18(int[] arr, int i) {
        if (i == 0) {
            return !(Page26.Ex8(arr[i], arr[i]));
        } else {
            return !(Page26.Ex8(arr[i], arr[i]) && (Ex18(arr, i - 1)));
        }
    }

    public static boolean Ex20(int[] arr) {
        int a = (int) (Math.random() * (arr.length - 1) + 1);
        int b = (int) (Math.random() * (arr.length - a) + a);

        return Ex20Helper(arr, a, b);
    }

    public static boolean Ex20Helper(int[] arr, int a, int b) {
        return a >= b || (arr[a] == arr[b] && Ex20Helper(arr, a + 1, b - 1));
    }

    public static String Ex22(String str) {
        if (str.length() < 3) {
            return str;
        } else {
            return str.substring(0, 3) + "*" + Ex22(str.substring(3));
        }
    }

    public static void Ex28(int n1, int d, int n) {
        if (n > 0) {
            System.out.println(n1 + d);
            Ex28(n1 + d, d, n - 1);
        }
    }
}
