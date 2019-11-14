package Archivos;

import java.util.Scanner;
import java.io.*;

public class Escribir {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("C:\\Users\\Labs-DCCO\\Documents\\taller\\Estudiante.csv");
    
    String name, last_name;
    int  fist_note ,second_note , third_note , father_num;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();
            System.out.print("Enter the father'sw number");
            father_num = enter.nextInt();            
            System.out.print("Enter the note 1: ");
            fist_note = enter.nextInt();
            System.out.print("Enter the nopte 2");
            second_note = enter.nextInt();      
            System.out.print("Enter the nopte 3");
            third_note = enter.nextInt();   
          
            
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("notes: " + fist_note + " / " + second_note + " / " + third_note + " / "  );
                mostrar.println("faher's name: " + father_num);
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
            System.out.print("Enter the father'sw number");
            father_num = enter.nextInt();            
            System.out.print("Enter the note 1: ");
            fist_note = enter.nextInt();
            System.out.print("Enter the nopte 2");
            second_note = enter.nextInt();      
            System.out.print("Enter the nopte 3");
            third_note = enter.nextInt();  
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                mostrar.println("notes: " + fist_note + " / " + second_note + " / " + third_note + " / "   );
                mostrar.println("faher's name: " + father_num);
               
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
    
}