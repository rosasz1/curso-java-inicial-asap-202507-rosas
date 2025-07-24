package org.example.clase1;

import java.util.Scanner;
/* Ejercicio04
Escribir un programa que compruebe si un anio es bisiesto. Un anio es bisiesto si es
 divisible por 4 y no lo es por 100 o si es divisible por 400.
*/




public class ejercicio4
{public static  void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el año: ");
    int ano = sc.nextInt();

    if (ano % 4 == 0 && ano % 100 != 0)
    {
        System.out.println("El año " + ano + " es bisiesto ");
    } else
        System.out.println("el año " + ano + " no es bisiesto " );
    sc.close();

}
}
