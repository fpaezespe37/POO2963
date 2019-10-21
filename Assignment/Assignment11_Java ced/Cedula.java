import java.util.Scanner;


class cedula
{
public static void main ( String[] args)  {
//int cedula = 120548967;
Scanner scn = new Scanner(System.in);
System.out.println("Ingrese la cedula: ");
int cedula = Integer.parseInt(scn.nextLine());
ClassCedula ced = new ClassCedula(cedula);
//System.out.println(cedula/10000000);
int y; 
int provincias = cedula/10000000;
int x; 
int z;
int total = 0; 
y = 1;
total = 0;
switch(provincias)
{
   // declaración case
   // los valores deben ser del mismo tipo de la expresión
   case 17 :
        System.out.println("La provincia es de Pichincha");
      break; // break es opcional
        
   case 18 :
        System.out.println("La provincia es de Tungurahua");
   break; // break es opcional
   
   case 12 :
        System.out.println("La provincia es de Los Rios");
   break;
   case 13 :
        System.out.println("La provincia es de Manabi");
   break; // break es opcional
   // Podemos tener cualquier número de declaraciones de casos o case
   // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
   // No se necesita descanso en el case default
   default : 
        System.out.println("La cedula es de otra provincia");
      // Declaraciones
}
while (ced.cedula > 0){
    x = ced.cedula % 10;
    
    
    
    if  (y == 1){
        x = x * 2;
        y = y + 1;
    } else
    {
        x = x * 1;
        y = 1;
    }
        
    if (x >= 10){
        z = x;
        z = x % 10;
        x = x / 10; //Proceso si supera a 10, caso es separa los numeros y sumarlo. 
        x = z + x;   //Suma de los dos numero separados superados por 10.
      
    }  
    total = total + x; 
    //System.out.println(total);
    //print(x)
    ced.cedula = ced.cedula / 10;
    //print(cedula)
    
        

}
    total = total % 10; 
if (total != 0){
    total = 10 - total;
}

    
System.out.println("El digito verificador es: " + total);

}
}