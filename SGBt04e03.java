/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos
muestre cuantas veces está contenido el carácter en la cadena.
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e03 {

    public static void main(String[] args) {
        String cadenaIntroducida;
        int numeroCoincidencias, coincidencias=0;
        Scanner teclado = new Scanner(System.in);
        String caracterIntroducido;

        try {
            System.out.println("Introduce una cadena: ");
            cadenaIntroducida = teclado.nextLine();
            System.out.println("Introduce un caracter: ");
            caracterIntroducido = teclado.nextLine();
            numeroCoincidencias= cadenaIntroducida.indexOf(cadenaIntroducida);
            if(coincidencias==-1){
                System.out.println("El caracter introducido no esta presente en la cadena introducida");
            }else{
                for (int i = 0; i < cadenaIntroducida.length(); i++){
                    if(cadenaIntroducida.charAt(i)==caracterIntroducido.charAt(0)){
                        numeroCoincidencias++;
                    }
                }
                System.out.printf("El caracter introducido esta presente %d veces", numeroCoincidencias);
            }

      
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
