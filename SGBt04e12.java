/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean
dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta
que lo haga correctamente.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        StringBuilder cadenaBuilder = new StringBuilder();
        Boolean cadenaCorrecta = false;

        try {
            do {
                System.out.println("Introduce una cadena de digitos no repetidos, de 6 posiciones: ");
                cadena = teclado.nextLine();
                cadenaBuilder.append(cadena);
                if (cadenaBuilder.length() == 6) {
                    for (int i = 0; i < 6; i++) {
                        if (!(Character.isDigit(cadenaBuilder.charAt(i)))) {
                            cadenaCorrecta = false;
                            break;
                        } else {
                            for (int j = 0; j < i; j++) {
                                if (cadenaBuilder.charAt(i) == cadenaBuilder.charAt(j)) {
                                    cadenaCorrecta = false;
                                    break;
                                } else {
                                    cadenaCorrecta = true;

                                }
                            }

                        }

                    }
                }
            } while (cadenaCorrecta == false);
            System.out.printf("La cadena cumple las condiciones: %b", cadenaCorrecta);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
