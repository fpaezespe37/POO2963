/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise2.clases;

import java.util.Scanner;

/**
 *
 * @author Pablo Cadna
 */
public class Book {
    public String title;
    public String editorial;
    public String author;
    public int publicateYear;

    public Book(){
        
    }
    public Book(String title, String editorial, String author, int publicYear) {
        this.title = title;
        this.editorial = editorial;
        this.author = author;
        this.publicateYear = publicYear;
    }

    @Override
    public String toString(){
        String information;
        information = "Title: " + title + "\nAutor " + author +"\nEditorial " + editorial +"\nYear Publication " + publicateYear;
        return information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicateYear() {
        return publicateYear;
    }

    public void setPublicateYear(int publicateYear) {
        this.publicateYear = publicateYear;
    }
    
}
