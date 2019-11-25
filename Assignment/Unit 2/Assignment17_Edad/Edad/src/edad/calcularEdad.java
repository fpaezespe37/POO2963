/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

/**
 *
 * @author Fred
 */

 

import java.util.GregorianCalendar;
 
public class calcularEdad {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Mostramos el resultado de llamar a la función calcular pasando
		// como parametro la fecha de nacimiento YYYY-MM-DD
                //Gregrian calendar librería propia de JAVA.
                GregorianCalendar fecha = new GregorianCalendar(2003,01,9);
		int day, month, year; 
                ExtractDate days = new ExtractDate();
                day = days.calculardays(fecha);
                month = days.calcularmonths(fecha);
                year = days.calcularyears(fecha);
                
                
                System.out.println("La edad en días es: " + day + " La edad en meses es:  " + month + " La edad en años es:  " + year);
	}       
 
    
        
    }


