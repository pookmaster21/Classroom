package class11.junk;

public class Classwork2010 {
    public static int countTwoDigits(int[] arr, int i) {
        if(i == 0) {
            if(arr[0] > 9 && arr[0] < 100) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (arr[0] > 9 && arr[0] < 100) {
                return 1 + countTwoDigits(arr, i - 1);
            } else {
                return countTwoDigits(arr, i - 1);
            }
        }
    }

    public static boolean checkAllSame(int[] arr, int i) {
        if(i == 0) {
            return true;
        } else {
            return ((arr[i] == arr[i - 1]) && checkAllSame(arr, i - 1));
        }

    }

    public static int biggest(int[] arr, int i) {
        if(i == 0) {
            return arr[i];
        } else {
            return Math.max(arr[i], biggest(arr, i - 1));
        }
    }

    public static void main(String[] args) {

    }
}
