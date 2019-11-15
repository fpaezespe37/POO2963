/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controler;


import ec.edu.espe.model.Director;
import ec.edu.espe.model.Movie;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class Main {
    
    public static void main(String[] args) {
        
         for (;;) {
            createMovie();
        }
        
    }
    
      private static void createMovie() {

        Scanner scan = new Scanner(System.in);
        Movie data1 = new Movie();
        Director data2 = new Director();
        
        System.out.println("Name Author: ");
        String fname = scan.nextLine();
        data2.setName(fname);
        System.out.println("Last Name Author: ");
        String lname = scan.nextLine();
        data2.setLastName(lname);
        System.out.println("Country of the author: ");
        String country = scan.nextLine();
        data2.setCountry(country);
        System.out.println("Book title: ");
        String title = scan.nextLine();
        data1.setTitle(title);
        System.out.println("Book Sinopsis: ");
        String sinopsis = scan.nextLine();
        data1.setSynopsis(sinopsis);
        System.out.println("Book Genre: ");
        String genre = scan.nextLine();
        data1.setGenre(genre);
        System.out.println("Post Year: ");
        int year = scan.nextInt();
        data1.setYear(year);
        
        System.out.println("\n The title is: " + data1.getTitle() +
                "\n Sinopsis: " + data1.getSynopsis() +
                "\n year publication: " + data1.getYear() +
                "\n Genre: " + data1.getGenre() + "\n");
        System.out.println("\n Name of the Author: " + data2.getName() + 
                "\nLast Name: " + data2.getLastName() + 
                "\nCountry: " + data2.getCountry() + "\n");
      }
}
