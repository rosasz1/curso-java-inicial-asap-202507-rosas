package org.example.clase1;

import java.util.Scanner;

/*Escribir un programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, anio) y 
calcule su numero de la suerte.
El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y
 a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 12/07/1980
Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
Numero de la suerte: 28
 */

public class ejercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de nacimiento (1-31): ");
    int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
    int mes = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento (4 dígitos): ");
    int anio = scanner.nextInt();

    int sumaFecha = dia + mes + anio;

    int numeroSuerte = 0;
        while (sumaFecha > 0 || numeroSuerte > 9) {
        if (sumaFecha == 0) {
            sumaFecha = numeroSuerte;
            numeroSuerte = 0;
        }
        numeroSuerte += sumaFecha % 10;
        sumaFecha /= 10;
    }

        System.out.println("Su número de la suerte es: " + numeroSuerte);

        scanner.close();
}
}

