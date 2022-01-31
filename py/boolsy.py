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


def start() -> None:
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
        entered = get_player_input(list(colors))
        for h in range(4):
            if entered[h] in code:
                if entered[h] == code[h]:
                    place = place + 1
                else:
                    color = color + 1
        if place == 4:
            break
        else:
            print(f"You got {color} in the right color but not the right " +
                  f"place, {place} in the the right color and right place")
        place, color = 0, 0
    if winner:
        print(f"You win!\nYou got it right in {i+1} moves")
    else:
        print("You didn't win, try next time!")


if __name__ == '__main__':
    start()
