'''
Using Python:

Write a program that asks the user to enter their name and their age.
Print out a message addressed to them that tells them the year that they will turn 100 years old.
'''


year =  2023
name = input("Enter your name: ")
age = int(input("Enter your age: "))
ageDifference = 100 - age
print(year+ageDifference)


# from datetime import datetime

# # getting the current year
# year = datetime.now().year
# year =  2023

# # collecting user input: name and age
# name = input("Enter your name: ")
# age = int(input("Enter your age: "))

# # calculating whether they ar ealready over 100, if not will print the year at which they will turn 100
# ageDifference = 100 - age
# if(ageDifference > 0):
#     print(year+ageDifference)
# else:
#     print("You are already on or above 100")