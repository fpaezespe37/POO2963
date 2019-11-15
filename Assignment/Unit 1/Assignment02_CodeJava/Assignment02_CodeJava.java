import java.util.Scanner;

public class Numeromayor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int firstnumber, secondnumber, thirdnumber;
        int highernumber;
        
        System.out.println("Digite N1 entero: ");
        firstnumber = entrada.nextInt();
        System.out.println("Digite N2 entero: ");
        secondnumber = entrada.nextInt();
        System.out.println("Digite N3 entero: ");
        thirdnumber = entrada.nextInt();
        
        highernumber = firstnumber;
        if(highernumber < secondnumber){
            highernumber = secondnumber;
        }if(highernumber < thirdnumber){
            highernumber = thirdnumber;           
        }
        
        System.out.println("El numero mayor es: "+highernumber);
        
                
    }
    
}