/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 * Ejercicio:  Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a
lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa
a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números,
espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas.
package sgbt04;
 */
package sgbt04;

import java.util.Scanner;

public class SGBt04e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        StringBuilder cadenaBuilder = new StringBuilder();

        try {
            //1ª version: cambian solo mayusculas
            System.out.println("Escribe una cadena de caracteres en mayusculas: ");
            cadena = teclado.nextLine();
            cadenaBuilder.append(cadena);

            for (int i = 0; i < cadenaBuilder.length(); i++) {

                switch (cadenaBuilder.charAt(i)) {
                    case 'A' -> {
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "F");
                    }
                    case 'B' ->{
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "X");
                }
                    case 'C' ->{
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "M");
                    }
                        
                    default -> {
                    }
                }
            }
            System.out.printf("La cadena encriptada es: %s", cadenaBuilder);
            System.out.println("");
            
            //2ª version: cambian mayusculas y minusculas
               System.out.println("Escribe una cadena de caracteres: ");
            cadena = teclado.nextLine();
            cadenaBuilder.append(cadena);

            for (int i = 0; i < cadenaBuilder.length(); i++) {

                switch (cadenaBuilder.charAt(i)) {
                    case 'A', 'a' -> {
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "F");
                    }
                    case 'B','b' ->{
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "X");
                }
                    case 'C','c' ->{
                        cadenaBuilder.delete(i, i + 1);
                        cadenaBuilder.insert(i, "M");
                    }
                        
                    default -> {
                    }
                }
            }
            System.out.printf("La cadena encriptada es: %s", cadenaBuilder);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
