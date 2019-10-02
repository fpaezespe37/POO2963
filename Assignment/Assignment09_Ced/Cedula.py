y = 1
total = 0
#y= cedula % 10
#print(y)
#cedula = cedula // 10
#print(cedula)
cedula = 175089375
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
        x = x // 10
        x = z + x 
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
