/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  (Opcional) Realiza un programa que muestre una contraseña generada aleatoriamente 
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre 
la ‘a’ y la ‘j’ pero sin letras repetidas. 
 */
package sgbt04;

import java.util.Random;

public class SGBt04e05 {

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        StringBuilder aj = new StringBuilder("abcdefghij");
        char caracter;
        int passwordLength;

        try {

            passwordLength = random.nextInt(5, 10);

            do {

                int randomNumber= random.nextInt(0, 10);
                caracter = aj.charAt(randomNumber);
                password.append(caracter);
                aj.deleteCharAt(caracter);//TODO: 

            } while (password.length()<passwordLength);

            System.out.println("La contraseña generada automaticamente es: " + password);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}



