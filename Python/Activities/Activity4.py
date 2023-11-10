decision = "yes"

while(decision.lower() == "yes"):
    # collecing both user inputs
    player1 = input("Select from Rock, Paper, Scissors: ").lower()
    player2 = input("Select from Rock, Paper, Scissors: ").lower()

    # checking who won
    if player1 == player2:
        print("Tie")
    elif (player1 == "rock" and player2 == "scissors") or (player1 == "scissors" and player2 == "paper") or (player1 == "paper" and player2 == "rock"):
            print("Player 1 Wins!")
    else:
        print("Player 2 Wins!")
    
    decision = input("You want to continue \n\t1. yes\n\t2. no\n>>>> ")