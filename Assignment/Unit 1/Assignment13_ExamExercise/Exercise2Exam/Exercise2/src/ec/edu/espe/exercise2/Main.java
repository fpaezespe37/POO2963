/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise2;

import ec.edu.espe.exercise2.clases.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> arrBook = new ArrayList<>();
        int opc =1;
        while(opc!=2){
             System.out.println("Ingrese libros, digite 2 para salir");
             
             Book book =new Book();
             System.out.println("Insert the name of the book");
             book.title = scan.nextLine();
             System.out.println("Insert the name Editorial");
             book.author = scan.nextLine();
             System.out.println("Insert yhe name of Author");
             book.editorial = scan.nextLine();
             System.out.println("Insert year publication");
             book.publicateYear = scan.nextInt();
             
             arrBook.add(book);
             System.out.println("quiere salir digite 2");
             opc = scan.nextInt();
            }    
        
        for (int i = 0; i < arrBook.size(); i++) {
             System.out.println(arrBook.get(i).toString());     
        }
        
        System.out.println("Buscar por año publicacion");
        int dato = scan.nextInt();
        for(int i = 0; i< arrBook.size();i++) {
            if (dato == arrBook.get(i).getPublicateYear()){
                 
                System.out.println(arrBook.get(i).toString()); 
            }
        }
        
        System.out.println("<<<<<<<<>>>>>>>>>");
        System.out.println("Por editorial: ");
        String dato2 = scan.nextLine();
        for(int i = 0; i< arrBook.size();i++) {
            if (dato2 == arrBook.get(i).getEditorial()){
                 
                System.out.println(arrBook.get(i).toString()); 
            }
        }
        System.out.println("<<<<<<<<>>>>>>>>>");
        System.out.println("Contar los libros con la editorial (ponga editorial): ");
        String dato4 = scan.nextLine();
        int cont =0;
        for(int i = 0; i< arrBook.size();i++) {
            if (dato4 == arrBook.get(i).getEditorial()){
                cont++;
            }
            System.out.println("tiene tantos libros con esa editorial: "+ cont);    
        }
    }
    
    
}
