package class11.junk;

public class HW {
    public static int Ex14(int[] arr, int i) {
        if(i == 0) {
            return 0;
        } else {
            return arr[i] + Ex14(arr, i - 1);
        }
    }

    public static boolean Ex17(int[] arr, int i) {
        if(i == 0) {
            return true;
        } else {
            return ((arr[i] > arr[i - 1]) && (Ex17(arr, i - 1)));
        }
    }

    /*
    public static boolean Ex18(int[] arr, int i) {
        if(i == 0) {
            return !(Page26.Ex8(arr[i], arr[i]));
        } else {
            return !(Page26.Ex8() && (Ex18(arr, i - 1)));
        }
    }
    */
}

