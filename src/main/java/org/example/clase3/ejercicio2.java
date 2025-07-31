package org.example.clase3;
/*Escribir un programa que pida 6 numeros por teclado,
los almacene en un array y que luego muestre el maximo valor, el minimo y las posiciones que
ocupan en el array.
 */
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_NUMEROS = 6;
        int[] numeros = new int[TOTAL_NUMEROS];

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maximo = encontrarMaximo(numeros);
        int minimo = encontrarMinimo(numeros);

        int posMaximo = encontrarPosicion(numeros, maximo);
        int posMinimo = encontrarPosicion(numeros, minimo);

        System.out.println("El valor máximo es " + maximo + " y su posición es " + posMaximo);
        System.out.println("El valor mínimo es " + minimo + " y su posición es " + posMinimo);
    }

    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for(int num : numeros) {
            if(num > maximo) maximo = num;
        }
        return maximo;
    }

    public static int encontrarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for(int num : numeros) {
            if(num < minimo) minimo = num;
        }
        return minimo;
    }

    public static int encontrarPosicion(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) return i;
        }
        return -1;
    }
}