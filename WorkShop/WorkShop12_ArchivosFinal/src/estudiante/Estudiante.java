/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Freddy¨Páez & Diego Páez
 * 
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name, last_name;
        int number;
        int resultado = 0;
        float prom = 0; 
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        Scanner reader = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner enter= new Scanner(System.in);
                Scanner obtener = new Scanner(System.in);

        int notas;
    
        File estudiante = new File ("Estudiante.csv");
        do{
            
        
        System.out.println("*********Menu de opciones*******");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Salir");
        
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("Ingrese los datos");
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Type a name: ");
            name = enter.next();
            System.out.println("Type a last name: ");
            last_name = enter.next();   
            System.out.print("Enter the grade:");
            notas = enter.nextInt();
            System.out.print("Ingrese la cantidad de numeros a sumar: ");
           
                System.out.print("Enter number of phone: ");
                number = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("Number: " + number);
                mostrar.println("promedio: " + prom);
                System.out.println("promedio de las notas:" + prom);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();            
            System.out.print("Enter a card number: ");
            number = enter.nextInt();
            System.out.print("ingrese nota 1:");
            nota1 = enter.nextInt();
            System.out.print("ingrese nota 2:");
            nota2 = enter.nextInt();
            System.out.print("ingrese nota 3:");
            nota3 = enter.nextInt();
            resultado = nota1+nota2+nota3; 
            System.out.println("La suma es " + nota1 + " + " + nota2 +  " + " + nota3 + " = " + resultado);
            prom= resultado / 3;     
            System.out.println("El promedio de la suma de: " + nota1 + " + " + nota2 +  " + " + nota3 + " es = " + prom);
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                mostrar.println("Number: "+ number);
                mostrar.println("promedio:"+ prom);
                 if(prom>= 7){
                System.out.print("El alumno ha aprobado el curso");

            }else{
                 System.out.print("El alumno ha reprobado :");
            }
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
                
                
                
                break;
                
            case 2:
                System.out.println("Muestra los datos");
                
            default :
                System.out.println("Selecion una opcion");
                break;
        }
        
        }while(opcion !=3);
    }
    
}
