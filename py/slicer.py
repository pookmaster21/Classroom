# date: 19\10\2021
# author: Lavi Jacob Landa
# The program takes the sentence and slicing it
if __name__ == '__main__':
    sentence = "Hello, my name is Inigo Montoya"
    print(sentence[slice(5)])
    print(sentence[slice(7, 14)])
    print(sentence[slice(0, len(sentence), 2)])
    print(sentence[slice(2, 19, 2)])
