"""
Read the CSV made in the previous program:

Print the values only in the Usernames column
Print the username and password of the second row
Sort the Usernames column data in ascending order and print data
Sort the Passwords column in descending order and print data
Hint: You can use DataFrame.sort_values("column") to sort your data

Hint: You can use DataFrame.sort_values("column", ascending=false) to sort your data in descending order.
"""

import pandas

dataframe = pandas.read_csv("credentials.csv")


print(dataframe["Usernames"])

print(dataframe["Usernames"][1], dataframe["Passwords"][1])

print(dataframe.sort_values("Usernames"))

print(dataframe.sort_values("Passwords", ascending=False))
