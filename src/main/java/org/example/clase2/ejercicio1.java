package org.example.clase2;
/*Ejercicio01
Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci.
El valor de N se lee por teclado.

La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es
el numero 1. El segundo termino de la serie es el numero 1. Los siguientes terminos de la serie de
fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
*/
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ver de la serie Fibonacci: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Ingrese un numero positivo porfavor.");
        } else {
            System.out.println("Los primeros " + N + " numeros de la serie Fibonacci son: ");

            int a = 1;
            int b = 1;

            if (N >= 1) {
                System.out.print(a);
            }
            if (N >= 2) {
                System.out.print(", " + b);
            }

            for (int j = 3; j <= N; j++) {
                int proximo = a + b;
                System.out.print(", " + proximo);

                a = b;
                b = proximo;
            }

            System.out.println();
        }

        sc.close();
    }
}
