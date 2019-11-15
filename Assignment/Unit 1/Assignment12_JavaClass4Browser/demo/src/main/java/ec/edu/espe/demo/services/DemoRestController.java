package ec.edu.espe.demo.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.utill.Person;
import ec.edu.espe.demo.verificationdni.ClassCedula;

//Etiquetas 
@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @GetMapping
    public String hello() {
        return "HOLA MUNDO SOY EL SERVICIO REST";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "ADIOS!!!!!!!!!!!";
    }

    @GetMapping(value = "/callme/{name}/{age}/{dni}")
    public Person name(@PathVariable String name, @PathVariable int age, @PathVariable String dni) {
        
        dni = validar(dni);

        return new Person(name, age, dni);
    }

    public static String validar(String cedulatemp) {
        
        int cedula = Integer.parseInt(cedulatemp);
        ClassCedula ced = new ClassCedula(cedula);
        // System.out.println(cedula/10000000);
        int digitover;
        String verificadni;
        int y;
        int provincias = ced.cedula / 10000000;
        digitover = ced.cedula % 10;
        ced.cedula = ced.cedula / 10;
        System.out.println(cedulatemp);
        int x;
        int z;
        int total = 0;
        y = 1;
        total = 0;
        switch (provincias) {
        // declaración case
        // los valores deben ser del mismo tipo de la expresión
        case 17:
            System.out.println("La provincia es de Pichincha");
            break; // break es opcional

        case 18:
            System.out.println("La provincia es de Tungurahua");
            break; // break es opcional

        case 12:
            System.out.println("La provincia es de Los Rios");
            break;
        case 13:
            System.out.println("La provincia es de Manabi");
            break; // break es opcional
        // Podemos tener cualquier número de declaraciones de casos o case
        // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno
        // de los casos es verdadero.
        // No se necesita descanso en el case default
        default:
            System.out.println("La cedula es de otra provincia");
            // Declaraciones
        }
        while (ced.cedula > 0) {
            x = ced.cedula % 10;

            if (y == 1) {
                x = x * 2;
                y = y + 1;
            } else {
                x = x * 1;
                y = 1;
            }

            if (x >= 10) {
                z = x;
                z = x % 10;
                x = x / 10; // Proceso si supera a 10, caso es separa los numeros y sumarlo.
                x = z + x; // Suma de los dos numero separados superados por 10.

            }
            total = total + x;
            // System.out.println(total);
            // print(x)
            ced.cedula = ced.cedula / 10;
            // print(cedula)

        }
        total = total % 10;
        if (total != 0) {
            total = 10 - total;
        }
            System.out.println("El digito verificador es: " + total);
        if(digitover == total){
            verificadni= "La cedula existe, el digito verificador es: " + total;
        }else{
            verificadni="La cedula no existe";
        }

        
        return verificadni;
    }

}
