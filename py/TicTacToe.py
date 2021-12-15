"""
author: Lavi Jacob Landa
date: 12/15/2021
explain: The program is a tic tac toe game!
"""
import os


def convert(entered):
    if entered[0] == "a":
        row = 1
    elif entered[0] == "b":
        row = 2
    elif entered[0] == "c":
        row = 3
    else:
        row = -1

    if entered[1] == "1" or entered[1] == "2" or entered[1] == "3":
        col = int(entered[1])
    else:
        col = -1
    return row, col


def is_convertible(entered):
    if len(entered) == 2 and (entered[0] == "a" or entered[0] == "b" or entered[0] == "c")\
            and (entered[1] == "1" or entered[1] == "2" or entered[1] == "3"):
        return True
    return False


def enter(board):
    # taking user input and checking if it's a legal move
    while True:
        entered = input("Enter row and column numbers to take spot: ")
        row, col = convert(entered)
        if row == -1 or col == -1 or (is_convertible(entered) is False):
            print("Illegal move!")
        else:
            break
    if board[row - 1][col - 1] != ' ':
        print("The spot is already taken!")
        row, col = enter(board)
    return row, col


def is_player_win(board, player):
    n = len(board)

    # checking rows
    for i in range(n):
        win = True
        for j in range(n):
            if board[i][j] != player:
                win = False
                break
        if win:
            return win

    # checking columns
    for i in range(n):
        win = True
        for j in range(n):
            if board[j][i] != player:
                win = False
                break
        if win:
            return win

    # checking diagonals
    win = True
    for i in range(n):
        if board[i][i] != player:
            win = False
            break
    if win:
        return win

    win = True
    for i in range(n):
        if board[i][n - 1 - i] != player:
            win = False
            break
    if win:
        return win

    for row in board:
        for item in row:
            if item == ' ':
                return False
    return True


def is_board_filled(board):
    # checking if the board is filled to draw the game
    for row in board:
        for item in row:
            if item == ' ':
                return False
    return True


def show_board(board):
    # prints the board
    printed_board = f"""
        1   2   3
      +---+---+---+
    a | {board[0][0]} | {board[0][1]} | {board[0][2]} |
      +---+---+---+
    b | {board[1][0]} | {board[1][1]} | {board[1][2]} |
      +---+---+---+
    c | {board[2][0]} | {board[2][1]} | {board[2][2]} |
      +---+---+---+
    """
    print(printed_board)


def start():
    # creating board
    board = []
    for i in range(3):
        row = []
        for j in range(3):
            row.append(' ')
        board.append(row)

    player = 'X'
    # starting the actual game
    while True:
        # printing which players turn is it
        print(f"Player {player} turn")

        # printing the starting board
        show_board(board)

        row, col = enter(board)

        # taking the spot
        board[row - 1][col - 1] = player

        # checking whether current player is won or not
        if is_player_win(board, player):
            os.system('cls' if os.name == 'nt' else 'clear')
            print(f"Player {player} wins the game!")
            break

        # checking whether the game is draw or not
        if is_board_filled(board):
            print("Match Draw!")
            break

        # swapping the turn
        player = 'X' if player == 'O' else 'O'

        # clearing console
        os.system('cls' if os.name == 'nt' else 'clear')
    # showing the final view of board
    print()
    show_board(board)


if __name__ == '__main__':
    # starting the game
    start()