#Hacer orden de funcion superior implementar el propio map
#y una funcion que eleve al cuadrado
def square(number):
    return number **2
lista = [1, 2, 3]
list1 = list(map(lambda square: square**2, lista))
print(list1)

#Resultado:
#[16, 30, 39, 105, 28]