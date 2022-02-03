"""
author: Lavi Jacob Landa
date: 3/1/2022
explain: A simple Bulls and Cows game!
"""
import os
import random


def create_code(colors: list) -> list:
    code = []
    for i in range(5, 1, -1):
        number = random.randint(0, i)
        code.append(colors[number])
        colors.remove(colors[number])
    return code


def get_player_input(colors: list) -> str:
    invalid = False
    while not invalid:
        entered = input("Enter 4 different colors r/g/b/y/o/c (for example" +
                        "rgby): ")
        if len(entered) != 4:
            print("You need to enter 4 colors!")
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
                            print(f"You need to enter r/g/b/y/o/c not {h}")
                            invalid = True
            else:
                print("You need to enter different colors!")
        if not invalid:
            return entered
        invalid = False


def show_board(guessed: list, results: list) -> None:
    os.system('cls' if os.name == 'nt' else 'clear')
    output = "Guessed |       Results\n--------|----------------------\n"
    for i in range(len(guessed)):
        if i < len(results)//2:
            output += guessed[i] + f"    |    " +\
                      f"{results[i*2-1]} bulls and {results[i*2]} cows\n"
        else:
            output += guessed[i] + "\n"
    print(output)


def start() -> None:
    guessed = []
    results = []
    colors = (
        'r',
        'g',
        'b',
        'y',
        'o',
        'c'
    )
    code = create_code(list(colors))
    place, color, winner = 0, 0, False
    for i in range(10):
        guessed.append(get_player_input(list(colors)))
        for h in range(4):
            if guessed[i][h] in code:
                if guessed[i][h] == code[h]:
                    place = place + 1
                else:
                    color = color + 1
        if place == 4:
            winner = True
            break
        else:
            results.append(place)
            results.append(color)
            show_board(guessed, results)
        place, color = 0, 0

    if winner:
        print(f"    YOU WIN!\nYou got it right in {i+1} moves")
    else:
        print("You didn't win, try next time!\nThe answer was " +
              f"{code[0] + code[1] + code[2] + code[3]}")


if __name__ == '__main__':
    start()
