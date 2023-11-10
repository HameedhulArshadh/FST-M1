"""
using pandas read the data from excel file
print the number of rows and columns
print the data in the email columns only
sort the data based on first name in ascending order
print the data
"""

import pandas as pd

# read the data from excel sheet
dataframe = pd.read_excel("../Data/employees3.xlsx")

# printing the rows and columns
print(len(dataframe.columns))
print(len(dataframe.values))

# getting the column that contains email address and printing its rows
emailColumn = 0
for i, column in enumerate(dataframe.columns):
    if "email" in column.lower():
        emailColumn = i

for row in dataframe.values:
    print(row[emailColumn])


# to sort data based on FirstName
dataframe = dataframe.sort_values(by=dataframe.columns[0])
print(dataframe)