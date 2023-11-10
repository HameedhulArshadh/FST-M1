'''
Using Python:

Make a two-player Rock-Paper-Scissors game.
Remember the rules:
Rock beats scissors
Scissors beats paper
Paper beats rock

'''

# collecing both user inputs
player1 = input("Select from Rock, Paper, Scissors: ").lower()
player2 = input("Select from Rock, Paper, Scissors: ").lower()

if player1 == player2:
    print("Tie")
elif player1 == "rock":
    if player2 == "scissors":
        print("Player 1 Wins!")
    else:
        print("Player 2 Wins!")
elif player1 == "scissors":
    if player2 == "paper":
        print("Player 1 Wins!")
    else:
        print("Player 2 Wins!")
elif player1 == "paper":
    if player2 == "rock":
        print("Player 1 Wins!")
    else:
        print("Player 2 Wins!")


# if player1 == player2:
#     print("Tie")
# elif (player1 == "rock" and player2 == "scissors") or (player1 == "scissors" and player2 == "paper") or (player1 == "paper" and player2 == "rock"):
#         print("Player 1 Wins!")
# else:
#     print("Player 2 Wins!")