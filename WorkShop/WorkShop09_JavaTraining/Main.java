import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<Person>();

        while (true) {
            System.out.println("Ingrese el nombre y edad: ");
            String aux = scn.nextLine();
            // aux = "Freddy 19"

            String[] vector = aux.split(" ");
            // vector[0] = "Freddy"
            // vector[1] = "19"
            // vector[2] = "Sangolqui"

            if (aux.equals("")) {
                break;
            }

            String name = vector[0];
            int age = Integer.parseInt(vector[1]);

            // int age = Integer.parseInt(scn.nextLine());
            Person person = new Person(name, age);

            list.add(person);

        }

        System.out.println("\n\nImpresion con for normal: ");
        for (int i = 0; i < list.size(); i++) {
            Person aux = list.get(i);
            System.out.println(aux.getName() + " - " + aux.getAge());
        }
        System.out.println("\n\nImpresion con for each: ");
        for (Person aux : list) {
            System.out.println(aux.getName() + " - " + aux.getAge());
        }
    }

}