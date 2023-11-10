"""
Using Loops:

Write a Python program to create the multiplication table (from 1 to 10) of a number.

"""
table = int(input("Enter a number from 1 to 10: "))
for i in range( 1, 11):
     print("{} X {} = {}".format(table, i, table*i))