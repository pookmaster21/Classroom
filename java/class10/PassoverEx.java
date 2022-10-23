import java.util.Arrays;
import java.util.Scanner;

public class PassoverEx {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int exercise;
        while (true) {
            System.out.print("\nEnter number of exercise: ");
            exercise = reader.nextInt();
            switch (exercise) {
                case 6:
                    System.out.print("Enter the starting number: ");
                    double start = reader.nextDouble();
                    System.out.print("Enter the differental: ");
                    double differental = reader.nextDouble();
                    System.out.print("Enter the number of numbers: ");
                    int number = reader.nextInt();
                    ArithmeticProgression prog = new ArithmeticProgression(start, differental, number);
                    System.out.println(prog.getNumber(prog.number));
                    prog.setNumber(prog.number + 1);
                    System.out.println(prog.getNumber(prog.number));
                    break;
                case 9:
                    String name;
                    String type;
                    double size;
                    String date;
                    boolean isOpen;
                    String content;

                    File[] files = new File[2];
                    for (int i = 0; i < files.length; i++) {
                        System.out.printf("Enter the name of file number %s:", i + 1);
                        name = reader.nextLine();
                        System.out.printf("Enter the type of file number %s:", i + 1);
                        type = reader.next();
                        System.out.printf("Enter the size of file number %s:", i + 1);
                        size = reader.nextDouble();
                        System.out.printf("Enter the date of creation of file number %s:", i + 1);
                        date = reader.next();
                        System.out.printf("Is file number %s open? ", i + 1);
                        isOpen = reader.nextBoolean();
                        System.out.printf("Enter the content of file number %s:", i + 1);
                        content = reader.nextLine();
                        files[i] = new File(name, type, size, date, isOpen, content);
                    }
                    if (files[0].getType() == files[1].getType()) {
                        files[0].setIsOpen(true);
                        files[1].setIsOpen(true);

                        System.out.print("Enter name for the new file: ");
                        File newFile = new File(reader.nextLine(), files[0].getType(),
                                files[0].getSize() + files[1].getSize(), null,
                                true, files[0].getContent() + files[1].getContent());

                        files = Arrays.copyOf(files, 3);
                        files[2] = newFile;

                        files[0].setIsOpen(false);
                        files[1].setIsOpen(false);
                        files[2].setIsOpen(false);
                    } else {
                        System.out.println("The types are not equal");
                    }
                    break;
                default:
                    System.out.println("invalid exercise, try again");
                    break;
            }
        }
    }

    public Fraction sumFraction(Fraction fraction1, Fraction fraction2) {
        int divider = fraction1.divider * fraction2.divider;
        int divided = fraction1.divided * fraction2.divider + fraction2.divided * fraction1.divider;
        return new Fraction(divided, divider);
    }

    public Fraction sumFraction(Fraction fraction1, Fraction fraction2, Fraction fraction3) {
        return sumFraction(fraction1, sumFraction(fraction2, fraction3));
    }
}

class Card {
    int type;
    int value;

    Card(int type, int value) throws Exception {
        if (type > 4 || type < 1) {
            throw new Exception("Type should be between 1 and 4, not " + type);
        } else if (value > 13 || value < 1) {
            throw new Exception("Value should be between 1 and 13, not " + value);
        }
        this.type = type;
        this.value = value;
    }

    public void setType(int type) throws Exception {
        if (type > 4 || type < 1) {
            throw new Exception("Type should be between 1 and 4, not " + type);
        }
        this.type = type;
    }

    public void setValue(int value) throws Exception {
        if (value > 13 || value < 1) {
            throw new Exception("Value should be between 1 and 13, not " + value);
        }
        this.value = value;
    }

    public int getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    public String getCardString() {
        String output = "";
        if (this.value == 1) {
            output += "Ace of ";
        } else if (this.value < 11) {
            output += this.value + " of ";
        } else if (this.value == 11) {
            output += "Jack of ";
        } else if (this.value == 12) {
            output += "Queen of ";
        } else if (this.value == 13) {
            output += "King of ";
        }
        if (this.type == 1) {
            output += "Clubs";
        } else if (this.type == 2) {
            output += "Diamonds";
        } else if (this.type == 3) {
            output += "Hearts";
        } else if (this.type == 4) {
            output += "Spades";
        }
        return output;
    }

    public boolean equals(Card card) {
        return this.value == card.value && this.type == card.type;
    }
}

class Deck {
    Card[][] deck;

    Deck() throws Exception {
        this.deck = new Card[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.deck[i][j] = new Card(i + 1, j + 1);
            }
        }
    }

    public Card getRandomCard() {
        return getCard((int) (Math.random() * 3 + 1), (int) (Math.random() * 12 + 1));
    }

    public Card getCard(int row, int column) {
        return this.deck[row][column];
    }

    public void randomizeDeck() {
        Card card;
        int type;
        int value;
        for (int i = 0; i < this.deck.length; i++) {
            for (int j = 0; j < this.deck[i].length; i++) {
                card = this.deck[i][j];
                type = (int) (Math.random() * 3 + 1);
                value = (int) (Math.random() * 12 + 1);
                this.deck[i][j] = this.deck[type][value];
                this.deck[type][value] = card;
            }
        }
    }
}

class ArithmeticProgression {
    double start;
    double differental;
    int number;

    ArithmeticProgression(double start, double differental, int number) throws IndexOutOfBoundsException {
        if (number < 1) {
            throw new IndexOutOfBoundsException("Number must be greater or equal to 1 not " + number);
        }
        this.start = start;
        this.differental = differental;
        this.number = number;
    }

    public double getNumber(int place) throws IndexOutOfBoundsException {
        if (place > this.number) {
            throw new IndexOutOfBoundsException("Number must be less or equal to " + this.number + " not " + place);
        }
        return this.start + place * this.differental;
    }

    public void setNumber(int number) {
        if (number < 1) {
            throw new IndexOutOfBoundsException("Number must be greater or equal to 1 not " + number);
        }
        this.number = number;
    }
}

class Fraction {
    int divided;
    int divider;

    Fraction(int devided, int divider) {
        if (divider == 0) {
            throw new IllegalArgumentException("Cannot divide a fraction with zero divider");
        }
        this.divided = devided;
        this.divider = divider;
    }

    public int getDevided() {
        return divided;
    }

    public int getDivider() {
        return divider;
    }

    public void setDevided(int divided) {
        this.divided = divided;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    public String toString() {
        return this.divided + "/" + this.divider;
    }

    public int getBiggestCommonDivisor() {
        int biggestCommonDivisor = 1;
        for (int i = 1; i <= this.divided && i <= this.divider; i++) {
            if (this.divided % i == 0 && this.divider % i == 0) {
                biggestCommonDivisor = i;
            }
        }
        return biggestCommonDivisor;
    }

    public void minimize() {
        int dividor = getBiggestCommonDivisor();
        if (dividor != 1) {
            this.divided = this.divided / dividor;
            this.divider = this.divider / dividor;
        }
    }
}

class File {
    private String name;
    private String type;
    private double size;
    private String date;
    private boolean isOpen;
    private String content;

    File(String name, String type, double size, String date, boolean isOpen, String content) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.date = date;
        this.isOpen = isOpen;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getSize() {
        return this.size;
    }

    public String getDate() {
        return this.date;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public String getContent() {
        return this.content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        String output = "";
        output += "Name: " + getName() + "\n";
        output += "Type: " + getType() + "\n";
        output += "Size: " + getSize() + "\n";
        output += "Date: " + getDate() + "\n";
        output += "isOpen: " + isOpen() + "\n";
        output += "Content: " + getContent() + "\n";
        return output;
    }

    public boolean sameType(File file) {
        return file.getType() == getType();
    }
}