package org.example.clase4;
/*Programa que pide el ingreso de un numero e indica si es un numero primo o no.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero : ");
        int numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println( numero + " Es primo");
        }  else {
            System.out.println( numero + " No es primo");
        }

    }
    public static boolean esPrimo(int numero){
            if (numero <= 1) {
                return false;
            }
            if (numero == 2) {
                return true;
            }
            if (numero % 2 == 0) {
            }
            for (int i = 3; i * i <= numero; i += 2) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


