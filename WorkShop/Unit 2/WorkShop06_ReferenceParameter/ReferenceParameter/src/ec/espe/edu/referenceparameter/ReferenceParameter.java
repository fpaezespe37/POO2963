/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.referenceparameter;

/**
 *
 * @author Labs-DCCO
 */
public class ReferenceParameter {

    static int p = 5;
    static int q = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here 
        System.out.println("Before calling method");
        System.out.println("p ----> " + p);
        System.out.println("q ----> " + q);

       
        int r = 0;
        r = sum(p, q);

        System.out.println("After calling method");

        System.out.println("p ----> " + p);
        System.out.println("q ----> " + q);
        System.out.println("result ----> " + r);
        
        
        Person person = new Person(1, "Freddy");
        System.out.println("Before calling the method ----> " + person);
        viewName(person);
        System.out.println("After calling the method ----> " + person);
           
        
    }

    public static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    
    
    public static void viewName (Person p){
        System.out.println("Person at first line of method" + p);
        p.setId(10);
        p.setName("Oscar");
        
    }
    
}
