import random

def play_easy(rando1, count):
    global round_end
    guess1 = input("Choose a number between 1 and 10!")
    if guess1 > rando1:
        print("Too high!")
        count += 1
    elif guess1 < rando1:
        print("Too low!")
        count += 1
    else:
        print("You got it!")
        count += 1
        str_count = str(count)
        print("It took you \t" + str_count + "\t tries!")
        round_end = 9
    return count

def play_medium (rando1, count):
    global round_end
    guess1 = input("Choose a number between 1 and 20!")
    if guess1 > rando1:
        print("Too high!")
        count += 1
    elif guess1 < rando1:
        print("Too low!")
        count += 1
    else:
        print("You got it!")
        count += 1
        str_count = str(count)
        print("It took you \t" + str_count + "\t tries!")
        round_end = 9
    return count

def play_hard (rando1, count):
    global round_end
    guess1 = input("Choose a number between 1 and 100!")
    if guess1 > rando1:
        print("Too high!")
        count += 1
    elif guess1 < rando1:
        print("Too low!")
        count += 1
    else:
        print("You got it!")
        count += 1
        str_count = str(count)
        print("It took you \t" + str_count + "\t tries!")
        round_end = 9
    return count

def round_result(round_number):
    print("Final Summary for Round \t" + round_number + ":")
    print("Player 1 used \t" + str_count_1 + "\t guesses!")
    print("Player 2 used \t" + str_count_2 + "\t guesses!")
    if count_1 < count_2:
        print("Player 1 wins this round! Player 2, you lose!")
    elif count_1 == count_2:
        print("Player 1 loses. Player 2, congrats!")
    elif count_1 > count_2:
        print("Player 2 prevails! Player 1, maybe next time.")


def main():
    global count, count_1, count_2, round_end, str_count_1, str_count_2, round_count, player_2_win, player_1_win, play
    round_end = 10
    round_count = 0
    player_1_win = 0
    player_2_win = 0
    count_1 = 0
    count_2 = 0
    play = True
    while play == True:
        print("Welcome to the Guessing Game!")
        print("Get ready for some high-level math!")

        choice_difficulty = int(raw_input("Would you like to play an easy (1), medium (2), or hard (3) game?"))
        while True:
            if choice_difficulty == 1:
                count_1 = 0
                count_2 = 0
                while count_1 < 10 and count_2 < 10:
                    if count_1 >= 10 and count_2 < 10:
                        break
                    elif count_2 >= 10 and count_1 < 10:
                        break

                    rando1 = random.randrange(1, 11)
                    print("Player 1's turn")
                    while True:
                        count_1 = play_easy(rando1, count_1)
                        str_count_1 = str(count_1)
                        print("Player 1 Guess #: \t" + str_count_1)
                        if round_end == 9:
                            round_end = 10
                            break

                    rando1 = random.randrange(1, 11)
                    round_end = 10
                    print("Player 2's turn")
                    while True:
                        count_2 = play_easy(rando1, count_2)
                        str_count_2 = str(count_2)
                        print("Player 2 Guess #:" + str_count_2)
                        if round_end == 9:
                            round_end = 10
                            break
                round_count += 1
                if round_count == 1:
                    str_num = str(1)
                    round_result(str_num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                elif round_count == 2:
                    str_2num = str(2)
                    round_result(str_2num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                        break
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                        break
                elif round_count == 3:
                    str_3num = str(3)
                    round_result(str_3num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    print(player_1_win)
                    print(player_2_win)
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                    break

                # CHOICE SETTING TWO

            elif choice_difficulty == 2:
                count_1 = 0
                count_2 = 0
                while count_1 < 15 and count_2 < 15:
                    if count_1 >= 15 and count_2 < 15:
                        break
                    elif count_2 >= 15 and count_1 < 15:
                        break
                    rando1 = random.randrange(1, 21)
                    print("Player 1's turn")
                    while True:
                        count_1 = play_medium(rando1, count_1)
                        str_count_1 = str(count_1)
                        print("Player 1 Guess #: \t" + str_count_1)
                        if round_end == 9:
                            round_end = 10
                            break

                    rando1 = random.randrange(1, 21)
                    round_end = 10
                    print("Player 2's turn")
                    while True:
                        count_2 = play_medium(rando1, count_2)
                        str_count_2 = str(count_2)
                        print("Player 2 Guess #:" + str_count_2)
                        if round_end == 9:
                            round_end = 10
                            break
                round_count += 1
                if round_count == 1:
                    str_num = str(1)
                    round_result(str_num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                elif round_count == 2:
                    str_2num = str(2)
                    round_result(str_2num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                        break
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                        break
                elif round_count == 3:
                    str_3num = str(3)
                    round_result(str_3num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    print(player_1_win)
                    print(player_2_win)
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                    break


                # CHOICE SETTING 3

            elif choice_difficulty == 3:
                count_1 = 0
                count_2 = 0
                while count_1 < 30 and count_2 < 30:
                    if count_1 >= 30 and count_2 < 30:
                        break
                    elif count_2 >= 30 and count_1 < 30:
                        break
                    rando1 = random.randrange(1, 101)
                    print("Player 1's turn")
                    while True:
                        count_1 = play_hard(rando1, count_1)
                        str_count_1 = str(count_1)
                        print("Player 1 Guess #: \t" + str_count_1)
                        if round_end == 9:
                            round_end = 10
                            break

                    rando1 = random.randrange(1, 101)
                    round_end = 10
                    print("Player 2's turn")
                    while True:
                        count_2 = play_hard(rando1, count_2)
                        str_count_2 = str(count_2)
                        print("Player 2 Guess #:" + str_count_2)
                        if round_end == 9:
                            round_end = 10
                            break
                round_count += 1
                if round_count == 1:
                    str_num = str(1)
                    round_result(str_num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                elif round_count == 2:
                    str_2num = str(2)
                    round_result(str_2num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                        break
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                        break
                elif round_count == 3:
                    str_3num = str(3)
                    round_result(str_3num)
                    if count_1 < count_2:
                        player_1_win += 1
                    elif count_1 == count_2:
                        player_2_win += 1
                    elif count_1 > count_2:
                        player_2_win += 1
                    print(player_1_win)
                    print(player_2_win)
                    if player_1_win > 1:
                        print("Player 1 wins the overall game!")
                    elif player_2_win > 1:
                        print("Player 2 wins the overall game!")
                    break


        print("The game has ended!")
        play = input("Would you like to play again (1) or quit (2)?")
        if play == 1:
            play = True
        elif play == 2:
            print("Have a nice day. :D")
            play = False


main()