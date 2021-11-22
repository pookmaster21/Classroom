"""
author: Lavi Jacob Landa
date: 10/24/2021
explain: The program generates a random number between 1 to 100 the
         person have 6 tries to guess the number.
         if he guesses correctly the program will exit and print:
         "You guessed the right number good job!".
         if he misses the program will print:
         "You guessed too high!" or "You guessed too low!" it depends
         on the number.
         if he guessed 6 time and didn't guessed correctly the program
         will exit and print:
         "You couldn't guess the right number, good luck next time!".
"""
import random


def guess_the_number():
    number = random.randint(2, 99)
    for i in range(6):
        guessed = int(input("Enter your guess: "))
        if guessed == number:
            print("You guessed the right number good job!")
            exit()
        elif guessed > number:
            print("You guessed too high!")
        else:
            print("You guessed too low!")
    print("You couldn't guess the right number, good luck next time!")


if __name__ == '__main__':
    guess_the_number()
