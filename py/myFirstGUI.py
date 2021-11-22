"""
author: Lavi Jacob Landa
date: 10/30/2021
explain: The program creates a simple window with:
            a button that prints stars,
            and a button that prints hello in different languages randomly.
"""
import random
from tkinter import *


def print_stars():
    print("**************")


def random_from_list():
    sentences = ["Hello!", "bonjour!", "Ciao!", "Привет!", "Здравствуйте!",
                 "你好!", "Salve!", "안녕하십니까!", "Olá!", "γεια σας!"]
    number = random.randint(0, 9)
    lblFromList = Label(app, text=sentences[number])
    lblFromList.pack(pady=20)


if __name__ == '__main__':
    app = Tk()
    app.title("Base Gui")
    app.geometry("300x150+400+300")
    app.configure(bg="white")
    lblStars = Label(app, text="Please click to print stars")
    lblStars.pack(pady=20)

    btnStars = Button(app, text="click", width=10, command=print_stars)
    btnStars.pack(side="left", padx=80, pady=20)

    btnRandomFromList = Button(app, text="click", width=10,
                               command=random_from_list)
    btnRandomFromList.pack(side="right", padx=80, pady=20)

    app.mainloop()
