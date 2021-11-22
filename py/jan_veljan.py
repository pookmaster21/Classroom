# date: 19\10\2021
# author: Lavi Jacob Landa
# The program takes a five digit number and prints the number, the digits
# and the sum of the digits
if __name__ == '__main__':
    number = int(input("Please enter your number: "))
    print("You entered the number:", number)
    first_digit = number // 10000
    second_digit = (number - (first_digit * 10000)) // 1000
    third_digit = (number - (first_digit * 10000) -
                   (second_digit * 1000)) // 100
    fourth_digit = (number - (first_digit * 10000) -
                    (second_digit * 1000) - (third_digit * 100)) // 10
    fifth_digit = (number - (first_digit * 10000) - (second_digit * 1000) -
                   (third_digit * 100) - (fourth_digit * 10))
    print(f"The digits of this number are: {first_digit}, {second_digit}, "
          f"{third_digit}, {fourth_digit}, {fifth_digit}")
    print("The sum of the digits ia:",
          first_digit+second_digit+third_digit+fourth_digit+fifth_digit)
