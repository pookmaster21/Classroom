"""
author: Lavi Jacob Landa
date: 10/24/2021
explain: The program prints all the numbers between
         2000 and 4000 (both included) that each digit of the number
         is an odd number
"""


def all_odd():
    all_odd_numbers = []
    for i in range(2000, 4001):
        number = str(i)
        if int(number[0]) % 2 != 0 \
                and int(number[1]) % 2 != 0 \
                and int(number[2]) % 2 != 0 \
                and int(number[3]) % 2 != 0:
            all_odd_numbers.append(number)
    print('.'.join(all_odd_numbers))


if __name__ == '__main__':
    all_odd()
