package org.example.clase2;
/*Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus cifras.
Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".*/
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int Numero =  sc.nextInt();
        if (Numero <= 0) {
            System.out.println("Ingrese un numero positivo porfavor. ");
            return;
        }

        String numString = Integer.toString(Numero);
        int suma = 0;

        for (int i = 0; i < numString.length(); i++) {
            suma += Character.getNumericValue(numString.charAt(i));
        }
        System.out.println("La suma total de las cifras es: " + suma);
        sc.close();
    }

}
