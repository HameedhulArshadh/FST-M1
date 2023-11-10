import pandas

# python dictionary
data = {
    "Usernames" : ("Hameed", "Arshadh"),
    "Passwords" : ("123456", "1234567")
}

# dict to dataframe
dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("creds.csv", index=False)
