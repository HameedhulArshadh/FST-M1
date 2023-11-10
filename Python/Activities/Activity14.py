'''
Using Recursion:

Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.

 
Hint: The Fibonnaci seqence is a sequence of numbers where the next number in the sequence is the sum of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …

'''

totalNumbers = int(input("How many numbers you want to print: "))
withRecursion = []
withLoops = []


# with recursion
def fibonacci(length):
    if length == 1:
        return 1
    elif length == 2:
        return 1
    else:
        return (fibonacci(length-1) + fibonacci(length-2))

for i in range(1, totalNumbers+1):
    withRecursion.append(fibonacci(i))


# with just loops
current = 1
previous = 1
for i in range(1, totalNumbers + 1):
    if i <= 2:
        withLoops.append(1)
    else:
        temp = current + previous
        withLoops.append(temp)
        previous =  current
        current = temp
        
print(withRecursion)
print(withLoops)

