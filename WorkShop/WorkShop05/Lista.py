num = [12, 2, 9, 10]
num1 = [15, 6, 12, 19]

multiply = zip(num,num1)

for student in multiply:
    print(student[0]*student[1])
