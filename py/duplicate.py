"""
author: Lavi Jacob Landa
date: 10/24/2021
explain: The program takes a sentence and prints the words in the sentence
         in an alphabetical order and without duplicated words
"""


def remove_duplicate():
    sentence = input("Enter a sentence: ")
    sentence = sentence.split()
    sentence.sort()
    for i in sentence:
        if i == sentence[sentence.index(i) + 1]:
            sentence.remove(i)
    print(' '.join(sentence))


if __name__ == '__main__':
    remove_duplicate()
