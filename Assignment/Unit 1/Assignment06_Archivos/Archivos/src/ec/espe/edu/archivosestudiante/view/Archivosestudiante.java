/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.archivosestudiante.view;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Fred
 */
public class Archivosestudiante {

    
        // TODO code application logic here
 
    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("Archivo2.csv");
    
    String name, last_name;
    int day_birth, month_birth, year_birth, CI;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.print("Please enter your name: ");
            name = enter.next();
            System.out.print("Please enter your last name: ");
            last_name = enter.next();
            System.out.print("Please enter your day birth: ");
            day_birth = enter.nextInt();            
            System.out.print("Please enter your month birth: ");
            month_birth = enter.nextInt();
            System.out.print("Please enter your year bith: ");
            year_birth = enter.nextInt();            
            System.out.print("Please enter your card id: ");
            CI = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: " + CI);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Please enter your name: ");
            name = enter.next();
            System.out.print("Please enter your last name: ");
            last_name = enter.next();
            System.out.print("Please enter your day birth: ");
            day_birth = enter.nextInt();            
            System.out.print("Please enter yourmonth birth: ");
            month_birth = enter.nextInt();
            System.out.print("Please enter your year bith: ");
            year_birth = enter.nextInt();            
            System.out.print("Please enter your card id: ");
            CI = enter.nextInt();
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                 mostrar.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: "+ CI);
               
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
    
}