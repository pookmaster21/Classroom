import java.util.Scanner;

public class ClassWork_6_1 {
    public static Scanner reader = new Scanner(System.in);
    public static void Ex1() {
        for(int i=1;i<=10;i++) {
            System.out.printf("Enter the id for person number %s:", i);
            String id = reader.next();
            if (id.charAt(0) == '5') {
                System.out.println("44" + id.substring(1));
            } else {
                System.out.println(id);
            }
        }
    }
    public static void Ex2() {
        int count = 0;
        for(int i=1;i<=10;i++) {
            System.out.printf("Enter the first word of pair number %s:", i);
            String word1 = reader.next();
            System.out.printf("Enter the second word of pair number %s:", i);
            String word2 = reader.next();
            if (word1.length() == word2.length() && word1.charAt(0) == word2.charAt(0) && word1.charAt(word1.length()-1) == word2.charAt(word2.length()-1)) {
                count++;
            }
        }
        System.out.println("There are " + count + " similar words");
    }
    public static String Ex3(String word) {
        String new_word = "";
        for (int i=0;i<word.length();i++) {
            new_word = word.charAt(i) + new_word;
        }
        return new_word;
    }
    public static String Ex4(String word) {
        String new_word = "";
        for (int i=0;i<word.length();i++) {
            new_word = new_word + word.charAt(i) + word.charAt(i);
        }
        return new_word;
    }
    public static String Ex5(String word) {
        String new_word = "";
        for (int i=0;i<word.length();i++) {
            if (word.charAt(i) != ' ') {
                new_word = new_word + word.charAt(i);
            }
        }
        return new_word;
    }
    public static int Ex6(String word, char letter) {
        int count = 0;
        for (int i=0; i<=word.length()-1;i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    public static String Ex7(String word) {
        String new_word = "";
        for (int i = 0; i < word.length(); i++) 
        {
            if (new_word.indexOf(word.charAt(i)) < 0)
            {
                new_word += word.charAt(i);
            }
        }
        return new_word;
    }
    public static String Ex8(String word) {
        String new_word = "";
        for (int i=0;i<word.length();i++) {
            if ((word.charAt(i) >= 65 && word.charAt(i) <= 90) || (word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                new_word += i+1;
            } else {
                new_word += word.charAt(i);
            }
        }
        return new_word;
    }
    public static void Ex9(String word1, String word2) {
        int count = 0;
        for (int i=0;i<word1.length()-word2.length();i++) {
            if (word1.substring(i, i+word2.length()).equals(word2)) {
                count++;
            }
        }
    }
    public static String Ex10(String word1, String word2) {
        String new_word = "";
        for (int i = 0; i < word1.length(); i++) 
        {
            if (new_word.indexOf(word1.charAt(i)) < 0 && word2.indexOf(word1.charAt(i)) >= 0)
            {
                new_word += word1.charAt(i);
            }
        }
        return new_word;
    }
    public static String Ex11(String word1, String word2) {
        String new_word = "";
        for (int i = 0; i < word1.length(); i++) 
        {
            if (new_word.indexOf(word1.charAt(i)) < 0)
            {
                new_word += word1.charAt(i);
            }
        }
        for (int i = 0; i < word2.length(); i++) 
        {
            if (new_word.indexOf(word2.charAt(i)) < 0)
            {
                new_word += word2.charAt(i);
            }
        }
        return new_word;
    }
    public static void main(String[] args) {
        String word, word2;
        System.out.print("Which exercise do you want to test: ");
        int ex = reader.nextInt();
        String blank = reader.nextLine();
        while (true) {
            switch (ex) {
                case 1:
                    Ex1();
                    break;
                case 2:
                    Ex2();
                    break;
                case 3:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println(Ex3(word));
                    break;
                case 4:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println(Ex4(word));
                    break;
                case 5:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println(Ex5(word));
                    break;
                case 6:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println("Enter a letter");
                    char letter = reader.next().charAt(0);
                    System.out.println(Ex6(word, letter));
                    break;
                case 7:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println(Ex7(word));
                    break;
                case 8:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println(Ex8(word));
                    break;
                case 10:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println("Enter another string");
                    word2 = reader.nextLine();
                    System.out.println(Ex10(word, word2));
                    break;
                case 11:
                    System.out.println("Enter a string");
                    word = reader.nextLine();
                    System.out.println("Enter another string");
                    word2 = reader.nextLine();
                    System.out.println(Ex11(word, word2));
                    break;
                default:
                    System.out.print("Invalid input try again");
                    break;
            }
            System.out.print("Which exercise do you want to check: ");
            ex = reader.nextInt();
            blank = reader.nextLine();
        }
    }
}
