"""
author: Lavi Jacob Landa
date: 3/1/2022
explain: A simple Bulls and Cows game!
"""
from tkinter import *
from tkinter import messagebox


def create_code(colors: list) -> list:
    import random

    code = []
    for i in range(5, 1, -1):
        number = random.randint(0, i)
        code.append(colors[number])
        colors.remove(colors[number])
    return code


def get_player_input(colors: tuple, input_box: Entry):
    invalid = False
    entered = input_box.get()
    if len(entered) != 4:
        messagebox.showinfo("Error", "You need to enter 4 colors!")
        invalid = True
    else:
        for i in range(4):
            if not invalid:
                if entered.count(entered[i]) != 1:
                    invalid = True
        if not invalid:
            for h in entered:
                if not invalid:
                    if h not in colors:
                        messagebox.showinfo("Error", f"You need to enter r/g/b/y/o/c not {h}")
                        invalid = True
        else:
            messagebox.showinfo("Error", "You need to enter different colors!")
    if not invalid:
        return entered
    else:
        return False


def start() -> None:
    code_label = Label(root, text="XXXX", font=("Helvetica", 20))
    code_label.grid(row=0, column=0)

    labels = []
    for i in range(1, 11):
        new_label = Label(root, text=" ", font=("Helvetica", 20))
        new_label.grid(row=i, column=0)
        labels.append(new_label)

    input_box = Entry(root, text=" ", font=('Helvetica', 20))
    input_box.grid(row=10, column=0)

    guess_btn = Button(root, text="Send guess", font=("Helvetica", 20),
                       command=lambda: var.set(True))
    guess_btn.grid(row=11, column=0)

    colors = (
        'r',
        'g',
        'b',
        'y',
        'o',
        'c'
    )
    code = create_code(list(colors))
    place, color, winner, entered, var = 0, 0, False, "", BooleanVar()
    for i in range(10):
        guess_btn.wait_variable(var)
        entered = get_player_input(colors, input_box)
        if not entered:
            i -= 1
            var = BooleanVar()
            input_box.delete(0, 'end')
            continue
        for h in range(4):
            if entered[h] in code:
                if entered[h] == code[h]:
                    place = place + 1
                else:
                    color = color + 1
        if place == 4:
            winner = True
            break
        else:
            labels[i].config(text=f"{entered}   black: {place}, white: {color}")
        place, color = 0, 0

    if winner:
        code_label.config(text=code)
        messagebox.showinfo("Congrats!", f"YOU WIN!\nYou got it right in {i+1} moves")
    else:
        messagebox.showinfo("Too bad for you!", "You didn't win, try next time!\nThe answer was " +
                            f"{code[0] + code[1] + code[2] + code[3]}")


if __name__ == '__main__':
    root = Tk()
    root.title('Bulls and Cows')

    start()

    root.mainloop()
