odd = list(range(1,101))
even = list(range(100,201))
numbers = []

for number in odd:
    if number % 2 == 1:
        numbers.append(number)

for number in even:
    if number % 2 == 0:
        numbers.append(number)

print(numbers)