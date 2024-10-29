/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio: Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con
el método System.out.printf.
Hola, me llamo Pepe Pérez López y tengo 20 años
suponiendo que se introduce Pepe Pérez López como nombre completo y 20 como edad.
*/

package sgbt04;

import java.util.Scanner;

public class SGBt04e09{

    public static void main(String[] args) {
        String nombreCompleto;
        int edad;
        Scanner teclado = new Scanner(System.in);
        

        try {

            //version printf
            System.out.println("Introduce el nombre completo: ");
            nombreCompleto= teclado.nextLine();
            System.out.println("Introduce la edad: ");
            edad = Integer.parseInt(teclado.nextLine());
            
            System.out.printf("Hola, me llamo %s y tengo %d años", nombreCompleto, edad);
            
            System.out.println("");
            //version format
            String frase= String.format("Hola, me llamo %s y tengo %d años", nombreCompleto, edad);
            System.out.println(frase);
           

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}

