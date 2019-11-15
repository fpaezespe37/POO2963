/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;




/**
 *
 * @author Steven
 */
public class Movie {
    
    private String title;
    private String synopsis;
    private int year;
    private String genre;
    private Director director;
    
    public Movie (){
    }
    
    public Movie(String title, String synopsis, int year, String genre, Director director ){
        
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
 
}

