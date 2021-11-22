def reverse_cycle_x(text, x):
    encrypt_text = text[::-1]
    for k in range(x):
        encrypt_text = encrypt_text[-1] + encrypt_text[0:-1]
    return encrypt_text


if __name__ == '__main__':
    print(reverse_cycle_x(input("Enter a string: "), int(input("Enter a number: "))))
