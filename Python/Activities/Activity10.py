numbers = []
print("Anything other than number will stop asking the user for further input...")
number = input("Enter a Number: ")

while (number.isdecimal()):
    numbers.append(int(number))
    number = input("Enter a Number: ")


numbersTuple = tuple(numbers)
print("Tuple is ", numbersTuple)

for number in numbersTuple:
    if number % 5 == 0:
        print(number)