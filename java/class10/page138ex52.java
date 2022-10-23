public class page138ex52 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 1000; number < 10000; number++) {
            int first_digit = number / 1000;
            int second_digit = (number - first_digit * 1000) / 100;
            int third_digit = (number - first_digit * 1000 - second_digit * 100) / 10;
            int fourth_digit = number % 10;
            if (first_digit == fourth_digit && second_digit == third_digit) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("There are " + count + " four digital numbers that are perfect numbers");
    }
}