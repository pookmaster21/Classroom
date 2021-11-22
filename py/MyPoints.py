"""
author: Lavi Jacob Landa
date: 8/11/2021
explain: The program creates a simple window with:
            a field:
                that you can enter your name.
            save button:
                that displays Hello {your name}.
            a number:
                that displays 0.
            plus button:
                that adds 1 to the number in the middle.
            minus button:
                that subtracts 1 from the number in the middle.
            reset button:
                that resets the number that is in the middle to 0
                and the displayed Hello {your name} to nothing.
            exit button:
                that exits the window.
"""
from tkinter import *


def minus():
    global number
    number -= 1

    lblScore.config(text=number)


def plus():
    global number
    number += 1

    lblScore.config(text=number)


def save():
    lblHello.config(text=f"Hello {entryName.get()}", width=7)


def reset():
    lblHello.config(text="")
    lblScore.config(text="0")


if __name__ == '__main__':
    number = 0

    win = Tk()
    win.title('GUI')
    win.minsize(175, 150)
    win.maxsize(175, 150)

    entryName = Entry(win, bg="White", font="david", width=7)
    entryName.grid(row=0, column=1)

    btnMinus = Button(win, font="david", command=minus, text="-")
    btnMinus.grid(row=1, column=0)

    lblScore = Label(win, font="david", text=number)
    lblScore.grid(row=1, column=1)

    btnPlus = Button(win, font="david", command=plus, text="+")
    btnPlus.grid(row=1, column=2)

    btnSave = Button(win, font="david", command=save, text="Save")
    btnSave.grid(row=2, column=1)

    lblHello = Label(win, font="david", text="")
    lblHello.grid(row=3, column=1)

    btnReset = Button(win, font="david", command=reset, text="reset")
    btnReset.grid(row=4, column=0)

    btnExit = Button(win, font="david", command=win.destroy, text="exit")
    btnExit.grid(row=4, column=2)

    win.mainloop()
