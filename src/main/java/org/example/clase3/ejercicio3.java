package org.example.clase3;
/*Escribir un programa que pida 5 numeros enteros, los
        almacene en un array, e indique por pantalla si dicho array es capicua.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_NUMEROS = 5; // Cambiado a 5 según el enunciado original
        int[] numeros = new int[TOTAL_NUMEROS];

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        boolean resultado = esCapicua(numeros);
        System.out.println("¿Es capicúa? " + resultado);
    }

    public static boolean esCapicua(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}