package class11;

import java.util.Scanner;

public class summer2022 {
    public static Scanner reader = new Scanner(System.in);

    // Exercise 1
    public static int[] Ex1(int[] arr1, int[] arr2) {
        int[] newArr = new int[Math.max(arr1.length, arr2.length)];
        for (int i=0;i<newArr.length;i++) {
            if (i < arr1.length && i < arr2.length) {
                newArr[i] = arr1[i] * arr2[i];
            } else if (i >= arr1.length) {
                newArr[i] = arr2[i];
            } else {
                newArr[i] = arr1[i];
            }
        }
        return newArr;
    }

    // Exercise 2
    public static boolean isPerfect(int[] arr) {
        int[] test = new int[arr.length];
        int lastValue = arr[0];
        int value = arr[lastValue];
        test[lastValue] = 1;
        while (lastValue != 0) {
            if (value == lastValue) {
                return false;
            }
            lastValue = value;
            value = arr[lastValue];
            test[lastValue] = 1;
        }

        for (int i : test) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 0};
        System.out.println(isPerfect(arr));
    }
}

// Exercise 3
class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public boolean isRed() {
        return this.red != 0 && this.green == 0 && this.blue == 0;
    }

    public boolean isGreen() {
        return this.red == 0 && this.green != 0 && this.blue == 0;
    }

    public boolean isBlue() {
        return this.red == 0 && this.green == 0 && this.blue != 0;
    }

    public boolean isWhite() {
        return this.red == 255 && this.green == 255 && this.blue == 255;
    }

    public boolean isBlack() {
        return this.red == 0 && this.green == 0 && this.blue == 0;
    }
}

class Structure {
    private Pixel[] arr;

    public Structure(int N) {
        this.arr = new Pixel[N];
    }

    public boolean isBalanced() {
        int areRed = 0;
        int areGreen = 0;
        int areBlue = 0;

        for (Pixel p:this.arr) {
            if (p.isRed()) {
                areRed++;
            } else if (p.isGreen()) {
                areGreen++;
            } else if (p.isBlue()) {
                areBlue++;
            }
        }

        return areRed == areGreen && areRed == areBlue;
    }

    public boolean isBlackWhite() {
        for (Pixel p:this.arr) {
            if (!p.isWhite() || !p.isBlack()) {
                return false;
            }
        }
        return true;
    }
}

// Exercise 4
class Range {
    private int low;
    private int high;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public static boolean isIncluded(Node<Integer> lst1, Node<Range> lst2) {
        Range currentRange = lst2.getValue();
        while (lst1 != null) {
            if (lst1.getValue() < currentRange.getLow() || lst1.getValue() > currentRange.getHigh()) {
                lst2 = lst2.getNext();
                if (lst2 == null) {
                    return false;
                }
                currentRange = lst2.getValue();
            } else {
                lst1 = lst1.getNext();
            }
        }

        return true;
    }
}
