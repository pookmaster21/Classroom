import os


def is_player_win(board, player):
    win = None

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
            if item == '-':
                return False
    return True

def is_board_filled(board):
    # checking if the board is filled to draw the game
    for row in board:
        for item in row:
            if item == '-':
                return False
    return True

def show_board(board):
    # just printing the board
    for row in board:
        for item in row:
            print(item, end=" ")
        print()

def start():
    # creating board
    board = []
    for i in range(3):
        row = []
        for j in range(3):
            row.append('-')
        board.append(row)

    player = 'X'
    # starting the actuale game
    while True:
        # printing wich players turn is it
        print(f"Player {player} turn")

        # printing the starting board
        show_board(board)

        # taking user input
        row, col = list(
            map(int, input("Enter row and column numbers to fix spot: ").split()))

        # checkig if spot is taken
        if board[row - 1][col - 1] != '-':
            print(f"{player} tried to cheat! player {'X' if player == 'O' else 'O'} wins!")
            break

        # taking the spot
        board[row - 1][col - 1] = player

        # checking whether current player is won or not
        if is_player_win(board, player):
            print(f"Player {player} wins the game!")
            break

        # checking whether the game is draw or not
        if is_board_filled(board):
            print("Match Draw!")
            break

        # swapping the turn
        player = 'X' if player == 'O' else 'O'

        # clearing console
        os.system('cls' if os.name=='nt' else 'clear')
        

    # showing the final view of board
    print()
    show_board(board)


if __name__ == '__main__':
    # starting the game
    start()
