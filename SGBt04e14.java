/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:(Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a
StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
a. Borrar el carácter que haya en la posición 3.
b. Insertar una ‘x’ en la posición 5.
c. Sustituir el carácter de la posición 1 por una ‘z’.
d. Borrar los caracteres entre la posición 5 y 10.
e. Darles la vuelta a todos los caracteres del StringBuilder.
f.Convertir el StringBuilder en cadena.
Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de
la posición indicada, sino producirá errores.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder cadenaBuilder = new StringBuilder();
        String cadena;

        try {
            System.out.println("Introduce una cadena de caracteres: ");
            cadena = teclado.nextLine();
            cadenaBuilder.append(cadena);
            // a. Borrar el carácter que haya en la posición 3.
            cadenaBuilder.deleteCharAt(3);
            System.out.printf("La cadena tras borrar el caracter de la posicion 3: %s", cadenaBuilder);
            //  b. Insertar una ‘x’ en la posición 5.
            cadenaBuilder.insert(5, 'x');
            System.out.printf("\nLa cadena tras insertar una ‘x’ en la posición 5: %s", cadenaBuilder);

            //   c. Sustituir el carácter de la posición 1 por una ‘z’.
            cadenaBuilder.replace(1, 2, "z");
            System.out.printf("\nLa cadena tras sustituir el carácter de la posición 1 por una ‘z’: %s", cadenaBuilder);

            //d. Borrar los caracteres entre la posición 5 y 10(incluidos).
            cadenaBuilder.delete(5, 11);
            System.out.printf("\nLa cadena tras bórrar los caracteres entre la posición 5 y 10: %s", cadenaBuilder);

            //  e. Darles la vuelta a todos los caracteres del StringBuilder.
            	
                cadenaBuilder.reverse();
		
            System.out.printf("\nLa cadena tras darles la vuelta a todos los caracteres del StringBuilder: %s", cadenaBuilder);

            //f.Convertir el StringBuilder en cadena.
            cadenaBuilder.toString();
            System.out.printf("\nLa cadena tras convertir el StringBuilder en cadena: %s", cadenaBuilder);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
