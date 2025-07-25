package org.example.clase2;
/*Escribir un programa que compruebe si dos numeros son amigos.
Dos numeros enteros positivos A y B son numeros amigos si la suma de los divisores propios
 de A es igual a B y la suma de los divisores propios de B es igual a A.
Los divisores propios de un número incluyen la unidad pero no el propio numero.
Un ejemplo de numeros amigos son los numeros 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.
La suma de los divisores propios de 284 da como resultado 220.
Por lo tanto 220 y 284 son amigos.
*/

import java.util.Scanner;

public class ejercicio2 {

    public static int SumarDivisiores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (SumarDivisiores(num1) == num2 && SumarDivisiores(num2)==num1) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos ");
        }
        else {
            System.out.println(num1 + " y " + num2 + " no son numeros amigos ");
        }
        sc.close();
    }


}
