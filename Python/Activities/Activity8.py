numbers = []
print("Anything other than number will stop asking the user for further input...")
number = input("Enter a Number: ")

while (number.isdecimal()):
    numbers.append(int(number))
    number = input("Enter a Number: ")

if(len(numbers) !=0 and numbers[0] == numbers[-1]):
    print(True)
else:
    print(False)