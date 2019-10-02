def func_name():
    print ("Usted introdujo su 'nombre''")

def func_others():
    print ("Usted introdujo algo absurdo")

respuesta = input('Introduzca "su nombre" o algo a su gusto: ')
func_name() if (respuesta=='Freddy') else func_others()
