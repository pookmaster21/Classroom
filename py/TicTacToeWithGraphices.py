"""
author: Lavi Jacob Landa
date: 12/15/2021
explain: The program is a tic tac toe game!
"""
from tkinter import *
from tkinter import messagebox


# disable all the buttons
def disable_all_buttons():
    for i in range(3):
        for g in range(3):
            b_list[i][g].config(state=DISABLED)


# swapping players
def swap_players():
    global player
    player = "X" if player == "O" else "O"


# Check to see if someone won
def checkifwon(player):
    winner = False

    # checking rows
    for i in range(3):
        if b_list[i][0]["text"] == player and\
                b_list[i][1]["text"] == player and\
                b_list[i][2]["text"] == player:
            for g in range(3):
                b_list[i][g].config(bg="red")
            winner = True
            messagebox.showinfo("Tic Tac Toe",
                                f"CONGRATULATIONS! {player} Wins!!")
            disable_all_buttons()

    # checking columns
    for i in range(3):
        if b_list[0][i]["text"] == player and\
                b_list[1][i]["text"] == player and\
                b_list[2][i]["text"] == player:
            for g in range(3):
                b_list[g][i].config(bg="red")
            winner = True
            messagebox.showinfo("Tic Tac Toe",
                                f"CONGRATULATIONS! {player} Wins!!")
            disable_all_buttons()

    # checking diagonals
    if not(winner):
        if b_list[0][0]["text"] == player and\
                b_list[1][1]["text"] == player and\
                b_list[2][2]["text"] == player:
            b_list[0][0].config(bg="red")
            b_list[2][2].config(bg="red")
            winner = True
        elif b_list[0][2]["text"] == player and\
                b_list[1][1]["text"] == player and\
                b_list[2][0]["text"] == player:
            b_list[0][2].config(bg="red")
            b_list[2][0].config(bg="red")
            winner = True
        if winner:
            b_list[1][1].config(bg="red")
            messagebox.showinfo("Tic Tac Toe", f"CONGRATULATIONS! {player} Wins!!")
            disable_all_buttons()

    # Checking if it's a tie
    tie = True
    if not(winner):
        for i in range(3):
            for g in range(3):
                if b_list[i][g]["text"] == " ":
                    tie = False
        if tie:
            messagebox.showinfo("Tic Tac Toe", "It's A Tie!\n No One Wins!")
            disable_all_buttons()


# Button clicked function
def b_click(b: Button):
    global player

    if b["text"] == " ":
        b.config(text=player)
        checkifwon(player)
        swap_players()
    else:
        messagebox.showerror("Tic Tac Toe",
                             "Hey! That box has already been selected" +
                             "\nPick Another Box...")


# Restart the game over!
def reset():
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

if __name__ == '__main__':
    root = Tk()
    root.title('Tic-Tac-Toe')

    # Create menue
    my_menu = Menu(root)
    root.config(menu=my_menu)

    # Create Options Menu
    options_menu = Menu(my_menu, tearoff=False)
    my_menu.add_cascade(label="Options", menu=options_menu)
    options_menu.add_command(label="Rest Game", command=reset)

    reset()

    root.mainloop()
