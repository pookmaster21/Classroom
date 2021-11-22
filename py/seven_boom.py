# date: 19\10\2021
# author: Lavi Jacob Landa
# The program prints all the numbers that have the digit 7 in them or are
# dividable by 7
if __name__ == '__main__':
    for i in range(100):
        if i % 7 == 0 or i // 10 == 7 or i % 10 == 7:
            print(i)
