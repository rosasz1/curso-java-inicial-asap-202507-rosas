
package org.example.clase1;
import java.util.Scanner;

//Escribir un programa que lea 1 numero entero por teclado e indique si es multiplo de 2 o de 3.//
public class ejercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero porfavor: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0) {
        System.out.println(numero + " es divisible por 2 jefe. ");
        
    }
     else if (numero % 3 == 0) {
        System.out.println(numero + " es divisible por 3 jefe.  ");

        }
     else System.out.println(numero + " no es divisible ni por 2 ni 3 jefe. ");

    }
}