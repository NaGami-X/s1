i = 0
numbers = []
#练习33
while i < 6:
    print(f"At the top i is {i}")
    numbers.append(i)

    i += 1
    print("Numbers now: ", numbers)
    print(f"At the top i is {i}")


print("The numbers: ")

for num in numbers:
    print(num)