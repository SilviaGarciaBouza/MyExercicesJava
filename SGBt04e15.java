/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones
impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g”
*/
package sgbt04;

import java.util.Scanner;

public class SGBt04e15{

    public static void main(String[] args) {
        StringBuilder cadena2= new StringBuilder();
        String cadena;
        Scanner tclado= new Scanner(System.in);
        char impar='*';
        

        try {
            System.out.println("Introduce un a cadena: ");
            cadena= tclado.nextLine();
            cadena2.append(cadena);
            for(int i=0;i<cadena.length(); i++){
                if(i%2==0){
                    
                     cadena2.deleteCharAt(i);
                     cadena2.insert(i, impar);
                    
                }
            }

            System.out.printf("La cadena con las posiciones impares sustuidas es: %s", cadena2);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
