/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio: Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una
cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        StringBuilder cadenaCreada= new StringBuilder(10);

        try {
            for(int contador = 0; contador<10;contador++){
            System.out.println("Introduce una cadena de caracteres: ");
            cadenaIntroducida = teclado.nextLine();
            cadenaCreada.insert(contador, cadenaIntroducida.charAt(0));
            }
            System.out.printf("La cadena creada es: %s", cadenaCreada);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
