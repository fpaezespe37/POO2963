y = 1
total = 0

cedula = 1750262176
while cedula > 0:
    x = cedula % 10
    
    #lista.append(x)
    
    if y == 1: 
        x = x * 2
        y = y + 1 
    else:
        x = x * 1 
        y = 1
    if x >= 10:
        z = x
        z = x % 10
        x = x // 10 #Proceso si supera a 10, caso es separa los numeros y sumarlo. 
        x = z + x   #Suma de los dos numero separados superados por 10.
    total = total + x 
    print(total)   
    #print(x)
    cedula = cedula // 10
    #print(cedula)
total = total % 10 
if total != 0:
    total = 10 - total
print("El digito verificador es: " + str(total))    
input()
