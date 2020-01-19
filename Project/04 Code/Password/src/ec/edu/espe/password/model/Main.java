/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.model;

/**
 *
 * @author ASUS
 */
public class Main {
    
      public static void main(String[] args) throws Exception {

        String encriptado = Password.Encrypt("Esto es una prueba");
        System.out.println(encriptado);
        String desencriptado = Password.Decrypted(encriptado);
        System.out.println(desencriptado);
    
}
}
