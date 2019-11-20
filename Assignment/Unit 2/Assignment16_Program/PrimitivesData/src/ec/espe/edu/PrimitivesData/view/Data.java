/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.PrimitivesData.view;

/**
 *
 * @author Fred
 */
public class Data {
    int number=3;
    float number1=(float) 5.5;
    int number2=8;
    char letra; 
    boolean b = true;
    boolean a = false;
    Boolean miBooleano = new Boolean(b); 
    double resultado;  
    
public void sumarfloat(){
    resultado = number + number1;
    System.out.println("La suma de un entero y un flotante es: " + resultado);
}
public void sumarint(){
    resultado = number + number2;
    System.out.println("La suma de dos enteros es: " + resultado);
}
public void verificarchar(){
       char ch1, ch2;
 
    ch1 = 88;  // codigo de x
    ch2 = 'a'; //vocal de la palabra 'letra'
 
    System.out.print("ch1 y ch2: ");
    System.out.println(ch1 + " y " + ch2);
  }
public void verfboolean(){
    Boolean miBooleano = new Boolean("true");
boolean b = miBooleano.booleanValue();
System.out.println(b);
}
}
   

