package org.example.clase1;
/* Escribir un programa lea por teclado una calificacion numerica entre 0 y 10 y muestre por
pantalla su correspondiente calificacion alfabetica.

La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:
0 <= nota < 5 Insuficiente
5 <= nota < 6 Suficiente
6 <= nota < 7 Bien
7 <= nota < 9 Notable
9 <= nota <= 10 Sobresaliente

La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para
poder obtener su equivalente calificacion alfabetica. Si la calificacion introducida no es valida
se muestra un mensaje indicandolo y el programa finaliza.
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota: ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 10) {
            String calificacion;
            if (nota >= 0 && nota < 5) {
                calificacion = "Insuficiente";
            } else if (nota >= 5 && nota < 6) {
                calificacion = "Suficiente";
            } else if (nota >= 6 && nota < 7) {
                calificacion = "Bien";
            } else if (nota >= 7 && nota < 9) {
                calificacion = "Notable";
            } else { // nota >= 9 && nota <= 10
                calificacion = "Sobresaliente";
            }
            System.out.println("Calificación: " + calificacion);
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        scanner.close();
    }
}


