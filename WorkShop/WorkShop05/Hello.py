
names = ['Steven','Dennis','Jerico','Stiven']
names[0] = 'El Stiven'
my_tuple = ('Stiven','Dennis')


print(names)
ages = [18, 60, 22, 26]
names_with_ages = zip(names, ages)

for i, students in enumerate(names_with_ages):