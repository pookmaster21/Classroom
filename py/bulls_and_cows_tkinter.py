"""
author: Lavi Jacob Landa
date: 3/1/2022
explain: A simple Bulls and Cows game!
"""
from tkinter import Frame, Tk, Toplevel, messagebox, Entry, Label, Button, BooleanVar
import random


def create_code(colors: list) -> list[str]:
    """
    A function that gets a list and generates a list of 4 random elements
    from the given list.
    """
    code = []
    for i in range(5, 1, -1):
        number = random.randint(0, i)
        code.append(colors[number][0])
        colors.remove(colors[number])
    return code


def get_player_input(colors: list, input_box: Entry):
    """
    A function gets a list and and an entry box and returns one of 2 things:
        1. if the input is invalid returns false value.
        2. if the input is valid returns what the player typed into the entry.
    """
    # Creating a shorted list of the colors list
    shorted_colors = []
    for i in colors:
        shorted_colors.append(i[0])

    # reseting veriables
    invalid = False
    entered = input_box.get()

    # Checking lenth of input
    if len(entered) != 4:
        messagebox.showinfo("Error", "You need to enter 4 colors!")
        invalid = True
    else:
        # Checking if every element is only 1 time
        for i in range(4):
            if not invalid:
                if entered.count(entered[i]) != 1:
                    invalid = True
        if not invalid:
            # Checking if the input is made from valid colors
            for index in entered:
                if not invalid:
                    if index not in shorted_colors:
                        messagebox.showinfo("Error", "You need to enter r/g/" +
                                            f"b/y/o/c not {index}")
                        invalid = True
        else:
            messagebox.showinfo("Error", "You need to enter different colors!")
    if not invalid:
        return entered
    return False


def reset(entry: Entry):
    """
    A function that resets the game
    """
    start()
    entry.delete(0, 'end')


def game_rules():
    """
    A game rules function
    """
    # Creating the window to display the rules
    rules_win = Toplevel(root)
    rules_win.grab_set()

    # Creating the Game Play label
    game_play_title_lbl = Label(rules_win, text="Game Play", font=("Helvetica", 24))
    game_play_title_lbl.grid()

    # Creaing the game play rules label
    rules_lbl = Label(rules_win,
                      text="The code can be made up of any combination of t" +
                           "he colored pegs. You may not use two or more pe" +
                           "gs of the same color.\nOnce the code is set, th" +
                           "e player(You!) can begin guessing, trying to du" +
                           "plicate the exact colors and positions of the h" +
                           "idden Code pegs.\nEach guess is made by placing" +
                           " a row of Code pegs on the unit. Each row of pe" +
                           "gs should be left in position throughout the ga" +
                           "me.\nAfter every guess, the computer will infor" +
                           "m the player of their progress using the square" +
                           "s under the results title.\nA black square mean" +
                           "s that there is a color in the right place, a w" +
                           "hite square means that there is a color not in " +
                           "the right place.",
                      font=("Helvetica", 18))
    rules_lbl.grid()

    # Creating the "End of Game" title label
    end_of_game_title_lbl = Label(rules_win, text="End of the Game", font=("Helvetica", 24))
    end_of_game_title_lbl.grid()

    # Creating thr end of game rules label
    end_of_game_rules_lbl = Label(rules_win,
                                  text="When there are 4 colors that are in" +
                                       " the right place, the player wins." +
                                       "\nIf after the 10th round the playe" +
                                       "r didn't guess correctly, the playe" +
                                       "r lost and the game finishes.",
                                  font=("Helvetica", 18))
    end_of_game_rules_lbl.grid()


def stop_game(game_window: Toplevel, input_box: Entry):
    """
    A function that stops the game.
    """
    # Empty the input box
    input_box.delete(0, 'end')

    # Kills the game
    game_window.destroy()


def main_menu():
    """
    A functhion that creats the starting main menu.
    """
    # Creating the "New Game" button
    new_game_btn = Button(root, text="New Game", font=("Helvetica", 20),
                          command=start)
    new_game_btn.grid()

    # Creating the "Rules" button
    rules_btn = Button(root, text="Geme Rules", font=("Helvetica", 20),
                       command=game_rules)
    rules_btn.grid()


def start() -> None:
    """
    A function that starts the game.
    """
    # Creating the game window
    game_window = Toplevel(root)
    game_window.grab_set()

    # Creating the code frame
    code_frame = Frame(game_window, highlightbackground="black",
                       highlightthickness=2)
    code_frame.grid(row=0, column=0, columnspan=2)

    # Creating the gusses frame
    gusses_frame = Frame(game_window, highlightbackground="black",
                         highlightthickness=2)
    gusses_frame.grid(row=2, column=0)

    # Creating the results frame
    results_frame = Frame(game_window, highlightbackground="black",
                          highlightthickness=2)
    results_frame.grid(row=2, column=1)

    # Creating the buttons frame
    btn_frame = Frame(game_window)
    btn_frame.grid(row=3, columnspan=2)

    # Creating the code labels
    code_labels = []
    for i in range(4):
        code_label = Label(code_frame, bg="grey", text=" ",
                           font=("Helvetica", 20))
        code_label.grid(row=0, column=i+2)
        code_labels.append(code_label)

    # Adding a guesses label
    guesses_lbl = Label(game_window, text="Guessed", font=("Helvetica", 12))
    guesses_lbl.grid(row=1, column=0)

    # Adding a result label
    result_lbl = Label(game_window, text="Result", font=("Helvetica", 12))
    result_lbl.grid(row=1, column=1)

    # Creating the guesses labels
    labels = []
    for row in range(10):
        labels.append([])
        for col in range(4):
            new_label = Label(gusses_frame, text=" ", font=("Helvetica", 20))
            new_label.grid(row=row+2, column=col)
            labels[row].append(new_label)

    # Creating the results labels
    results = []
    for row in range(10):
        results.append([])
        for col in range(4):
            new_result = Label(results_frame, text=" ",
                               font=("Helvetica", 20), borderwidth=1,
                               relief="solid")
            new_result.grid(row=row+2, column=col+5)
            results[row].append(new_result)

    # Creating the input entry
    input_box = Entry(btn_frame, text=" ", font=('Helvetica', 20))
    input_box.grid(row=0, columnspan=2)

    # Creating the confirm guess button
    guess_btn = Button(btn_frame, text="Send guess", font=("Helvetica", 20),
                       command=lambda: var.set(True))
    guess_btn.grid(row=1, columnspan=2)

    # Creating the reset button
    reset_btn = Button(btn_frame, text="Reset geme", font=("Helvetica", 20),
                       command=lambda: reset(input_box))
    reset_btn.grid(row=2, column=0)

    # Creating exit button
    exit_btn = Button(btn_frame, text="Exit", font=("Helvetica", 20),
                      command=lambda: stop_game(game_window, input_box))
    exit_btn.grid(row=2, column=1)

    # Colors list
    colors = (
        "red",
        "green",
        "blue",
        "yellow",
        "orange",
        "cyan"
    )

    # Creating the code
    code = create_code(list(colors))

    # Reseting the variables
    place, color = 0, 0
    winner, var = False, BooleanVar()
    entered = ""

    # Starting the game loop
    for i in range(10):
        # Waiting for the player to press the guess confirm button
        guess_btn.wait_variable(var)

        # Getting the player input
        entered = get_player_input(list(colors), input_box)

        # Clear the input box
        input_box.delete(0, 'end')

        # If the player entered invalid guess
        if not entered:
            i -= 1
            var = BooleanVar()
            continue

        # If the guess is valid checking how much blacks and how much whites
        for j in range(4):
            if entered[j] in code:
                if entered[j] == code[j]:
                    place = place + 1
                else:
                    color = color + 1

        # showing the last guess and results
        for j in range(4):
            # Showing the labels
            for suspected_color in colors:
                if entered[j] == suspected_color[0]:
                    labels[i][j].config(bg=suspected_color)
            # Showing number of blacks
            for blacks in range(place):
                results[i][blacks].config(bg="black")
            # Showing the number of whites
            for whites in range(color):
                results[i][whites+place].config(bg="white")

        # If 4 colors are in the right place ending the game
        if place == 4:
            winner = True
            break
        # If didn't win reseting veriables
        place, color = 0, 0

    # Showing the player the right code
    for i in range(4):
        for color in colors:
            if code[i] == color[0]:
                code_labels[i].config(bg=color)

    # If won displays win message
    if winner:
        messagebox.showinfo("Congrats!", "YOU WIN!\nYou got it right in" +
                            f" {i+1} moves")
    # If didn't won displays lose message
    else:
        messagebox.showinfo("Too bad for you!",
                            "You didn't win, try next time!")


if __name__ == '__main__':
    # Inisializing game window
    root = Tk()

    # Giving the window a title
    root.title('Bulls and Cows')

    # Starting actual game
    main_menu()

    # Mainloop
    root.mainloop()
