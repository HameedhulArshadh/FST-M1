'''
Using Python:

Ask the user for a number.
Depending on what number they enter, tell them if the number is an even or odd number.

'''

number = int(input("Enter the number: "))

if(number%2 == 0):
    print("Even")
else:
    print("Odd")