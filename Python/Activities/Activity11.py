fruits = {"Apple": 100, "Orange": 60, "Tomato": 180}

fruitToCheck = input("Enter the fruit name: ")

fruitList =  fruits.keys()
if fruitToCheck in fruitList:
    print("Fruit is there and it is {} rupees".format(fruits[fruitToCheck]))
else:
    print("Not found")