def func_clave():
    print ("Su clave es correcta, bienvenido Jefe")

def func_claveerronea():
    print ("La clave es incorrecta no puede ingresar")

clave = input('Introduzca "su clave" para poder ingresar: ')
func_clave() if (clave=='holamundo2019') else func_claveerronea()