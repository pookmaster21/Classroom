"""
author: Lavi Jacob Landa
date: 12/15/2021
explain: The program is a tic tac toe game!
"""
from hashlib import new
from tkinter import *
from tkinter import messagebox


# Disable all the buttons
def disable_all_buttons():
    for i in range(3):
        for g in range(3):
            b_list[i][g].config(state=DISABLED)


def read_win_file():
    try:
        with open(r"TicTacToe.txt", "r") as file:
            lines = []
            count = 1
            while(line := file.readline().rstrip()):
                lines.append(line)
                if count == 10:
                    break
                count =+ 1
            return lines
    except FileNotFoundError:
        open(r"TicTacToe.txt", "w")


# Check to see if someone won
def checkifwon(player):
    winner = False

    # Checking rows and colums
    for i in range(3):
        if b_list[i][0]["text"] == player and\
                b_list[i][1]["text"] == player and\
                b_list[i][2]["text"] == player:
            for g in range(3):
                b_list[i][g].config(bg="red")
            winner = True
        if b_list[0][i]["text"] == player and\
                b_list[1][i]["text"] == player and\
                b_list[2][i]["text"] == player:
            for g in range(3):
                b_list[g][i].config(bg="red")
            winner = True

    # Checking diagonals
    if b_list[0][0]["text"] == player and\
            b_list[1][1]["text"] == player and\
            b_list[2][2]["text"] == player:
        b_list[0][0].config(bg="red")
        b_list[2][2].config(bg="red")
        b_list[1][1].config(bg="red")
        winner = True
    elif b_list[0][2]["text"] == player and\
            b_list[1][1]["text"] == player and\
            b_list[2][0]["text"] == player:
        b_list[0][2].config(bg="red")
        b_list[2][0].config(bg="red")
        b_list[1][1].config(bg="red")
        winner = True

    # Win message
    if winner:
        messagebox.showinfo("Tic Tac Toe", f"CONGRATULATIONS! {player} Wins!!")
        disable_all_buttons()
        old_lines = read_win_file()
        new_lines = [player + "\n"]
        if old_lines is not None:
            for i in range(len(old_lines)):
                new_lines.append(old_lines[i] + "\n")
        with open(r"TicTacToe.txt", "w") as file:
            file.writelines(new_lines)

    # Checking if it's a tie
    if not(winner):
        tie = True
        for i in range(3):
            for g in range(3):
                if b_list[i][g]["text"] == " ":
                    tie = False
        if tie:
            messagebox.showinfo("Tic Tac Toe", "It's A Tie!\n No One Wins!")
            disable_all_buttons()
            old_lines = read_win_file()
            new_lines = ["Tie\n"]
            if old_lines is not None:
                for i in range(len(old_lines)):
                    new_lines.append(old_lines[i] + "\n")
            with open(r"TicTacToe.txt", "w") as file:
                file.writelines(new_lines)


# Button clicked function
def b_click(b: Button):
    global player

    if b["text"] == " ":
        b.config(text=player)
        checkifwon(player)
        # Swapping players
        player = "X" if player == "O" else "O"
    else:
        messagebox.showerror("Tic Tac Toe",
                             "Hey! That box has already been selected" +
                             "\nPick Another Box...")


# Rules window
def rules():
    rules_win = Toplevel()
    rules_win.title("Rules")
    rules_win.grab_set()
    title = Label(rules_win, text="RULES FOR TIC-TAC-TOE.",
                  font=("Helvetica", 20))
    rules = Label(rules_win,
                  text="1. The game is played on a grid that's 3 squares by " +
                       "3 squares.\n2. You are X, your friend or the compute" +
                       "r is O.Players take turns putting their marks in emp" +
                       "ty squares.\n3. The first player to get 3 of his mar" +
                       "ks in a row (up, down, across, or diagonally) is the" +
                       " winner.\n4. When all 9 squares are full, the game i" +
                       "s over. If no player has 3 marks in a row, the game " +
                       "ends in a tie.",
                  font=("Helvetica", 20))
    title.grid(row=0, column=0)
    rules.grid(row=1, column=0)


# Top Ten window
def top_ten():
    top_ten_win = Toplevel()
    top_ten_win.title("Top Ten")
    top_ten_win.grab_set()
    lines = read_win_file()
    if lines is not None:
        if len(lines) < 10:
            times = len(lines)
        else:
            times = 10
        for i in range(times):
            if lines[i] == "Tie":
                line = Label(top_ten_win, text=f"{i+1}. Tie",
                             font=("Helvetica", 20))
            else:
                line = Label(top_ten_win, text=f"{i+1}. {lines[i]} won",
                             font=("Helvetica", 20))
            line.pack()
    else:
        line = Label(top_ten_win, text="No Games Found",
                     font=("Helvetica", 20))


# Restart the game over!
def reset_game():
    global b_list, player
    player = "X"

    # Build our buttons
    b1 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b1))
    b2 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b2))
    b3 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b3))
    b4 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b4))
    b5 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b5))
    b6 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b6))
    b7 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b7))
    b8 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b8))
    b9 = Button(root, text=" ", font=("Helvetica", 20),
                height=3, width=6, command=lambda: b_click(b9))
    b_list = [[b1, b2, b3], [b4, b5, b6], [b7, b8, b9]]
    for i in range(3):
        for g in range(3):
            b_list[i][g].grid(row=i, column=g)

    # Build our rules button
    rules_btn = Button(root, text="Rules", font=("Helvetica", 20), height=3,
                       width=6, command=rules)
    rules_btn.grid(row=3, column=0)

    # Build our new game button
    new_game_btn = Button(root, text="New Game", font=("Helvetica", 20),
                          height=3, width=6, command=reset_game)
    new_game_btn.grid(row=3, column=1)

    # Build our top ten button
    top_ten_btn = Button(root, text="Top Ten", font=("Helvetica", 20),
                         height=3, width=6, command=top_ten)
    top_ten_btn.grid(row=3, column=2)


if __name__ == '__main__':
    root = Tk()
    root.title('Menu')

    reset_game()

    root.mainloop()
