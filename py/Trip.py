"""
author: Lavi Jacob Landa
date: 21/11/2021
explain: The program creates a simple window with:
            a field:
                that you can enter your name.
            another field:
                that you can enter your last name.
            a check box for health declaration.
            a check box for parental permission.
            and a radio button to confirm if you have any allergies and
            if you have you will need to choose which one
            save button:
                that saves your name, your last name, if you have health
                declaration, if you have parental permission and if you
                have allergies and which one in a file named save.txt in
                the folder that the program is in.
"""
from tkinter import *


def allergieTrue():
    global chose
    btnSave.grid(row=8, column=0)
    listbox.grid(row=7, column=0)


def save():
    global health, parent, chose, listbox
    chose = listbox.curselection()
    with open(r'save.txt', 'a') as file:
        lines = [entryName.get() + " " + entryLastName.get() +
                ":\n     Health declaration:\n          "]
        if health.get():
            lines.append("Have")
        else:
            lines.append("Doesn't have")
        lines.append("\n     Parental permission:\n          ")
        if parent.get():
            lines.append("Have")
        else:
            lines.append("Doesn't have")
        lines.append("\n     Allergies:")
        if chose != ():
            for allergy in chose:
                lines.append("\n          " + allergies[allergy])
            lines.append("\n")
        else:
            lines.append("\n          Doesn't have\n")
        file.writelines(lines)
    entryName.delete(first=0, last=len(entryName.get())+1)
    entryLastName.delete(first=0, last=len(entryLastName.get()) + 1)
    health = BooleanVar()
    parent = BooleanVar()
    chose = "No"


if __name__ == '__main__':
    win = Tk()
    win.title("Trip registration form")
    health = BooleanVar()
    parent = BooleanVar()
    chose = "No"
    allergies = ["Gluten", "Eggs", "Nuts", "Milk"]

    lblName = Label(win, font="david", text="Name: ")
    lblName.grid(row=0, column=0)

    entryName = Entry(win, font="david")
    entryName.grid(row=0, column=1)

    lblLastName = Label(win, font="david", text="Last name: ")
    lblLastName.grid(row=1, column=0)

    entryLastName = Entry(win, font="david")
    entryLastName.grid(row=1, column=1)

    checkHealth = Checkbutton(win, font="david", text="Health declaration",
                              variable=health)
    checkHealth.grid(row=2, column=0)

    checkParent = Checkbutton(win, font="david", text="Parental permission",
                              variable=parent)
    checkParent.grid(row=3, column=0)

    lblSensitivity = Label(win, font="david", text="Allergies:")
    lblSensitivity.grid(row=4, column=0)

    chooseSensitivityTrue = Radiobutton(win, font="david", text="Yes",
                                        variable=chose, command=allergieTrue)
    chooseSensitivityTrue.grid(row=5, column=0)

    chooseSensitivityFalse = Radiobutton(win, font="david", text="No",
                                         variable=chose, value="No")
    chooseSensitivityFalse.grid(row=6, column=0)

    listbox = Listbox(win, font="david", selectmode=MULTIPLE)
    for allergy in allergies:
        listbox.insert(END, allergy)

    btnSave = Button(win, font="david", text="save", command=save)
    btnSave.grid(row=7, column=0)

    win.mainloop()
