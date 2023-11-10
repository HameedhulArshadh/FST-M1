def recursive_adder(num):
    if num <= 1:
        return 1;
    else:
        return num + recursive_adder(num-1)

print(recursive_adder(10))
