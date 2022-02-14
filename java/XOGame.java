import java.util.Scanner;

public class XOGame {
    public static Scanner reader = new Scanner(System.in);
    public static int[] getTile(char[][] board) {
        System.out.print("Enter a row(1, 2 or 3): ");
        int row = reader.nextInt();
        System.out.print("Enter a column(1, 2 or 3): ");
        int column = reader.nextInt();
        int[] n = new int[2];
        if(!((row == 1 || row == 2 || row == 3) && (column == 1 || column == 2 || column == 3))) {
            System.out.println("It can only be 1, 2 or 3");
            return getTile(board);
        }
        if(board[row - 1][column - 1] == ' ') {
            n[0] = row;
            n[1] = column;
            return n;
        } else {
            System.out.println("This tile is already taken! ");
            return getTile(board);
        }
    }
    public static boolean isWin(char[][] board, char player) {
        boolean winner;
        for(int i=0;i<3;i++) {
            winner = true;
            for(int g=0;g<3;g++) {
                // Checking rows and columns
                if(board[i][g] != player || board[g][i] != player) {
                    winner = false;
                    break;
                }
            }
            if(winner){
                return winner;
            }
        }

        // Checking diagonals
        winner = true;
        for(int i=0;i<3;i++) {
            if(board[i][i] != player) {
                winner = false;
                break;
            }
        }
        if(winner) {
            return winner;
        }

        winner = true;
        for(int i=0;i<3;i++) {
            if(board[i][2-i] != player) {
                winner = false;
            }
        }
        if(winner) {
            return winner;
        }

        for(char[] i:board) {
            for(char g:i) {
                if(g == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isDraw(char[][] board) {
        for(char[] i:board) {
            for(char g:i) {
                if(g == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(char[][] board) {
        String printedBoard = "";
        for(int i=0;i<3;i++) {
            printedBoard += "+---+---+---+\n";
            printedBoard += "| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |\n";
        }
        printedBoard += "+---+---+---+";
        System.out.println(printedBoard);
    }
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char player = 'X';
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.printf("player: %s turn\n", player);
            printBoard(board);
            int[] input = getTile(board);
            board[input[0] - 1][input[1] - 1] = player;

            if(isWin(board, player)) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                printBoard(board);
                System.out.println(player + " Won!");
                break;
            } else if(isDraw(board)) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                printBoard(board);
                System.out.println("It's a tie!");
                break;
            }
            if(player == 'X')
                player = 'O';
            else
                player = 'X';
        }
    }
}
