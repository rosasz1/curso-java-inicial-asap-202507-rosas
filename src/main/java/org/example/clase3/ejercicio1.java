package org.example.clase3;
/*Ejercicio01
Escribir un programa que lea la altura de N personas y calcule:
La altura media.
Cuantas personas tienen una altura superior a la media.
Cuantas tienen una altura inferior a la media.
*/
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a ser evaluadas: ");
        int personas = sc.nextInt();
        if (personas <= 0) {
            System.out.println("El numero de personas es negativo, ingrese un numero positivo: ");
            personas = sc.nextInt();
        }

        double[] alturas = new double[personas];

        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona: " + (i + 1)+ ": ");
            alturas[i] = sc.nextDouble();
        }
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        double media = suma / personas;
        System.out.println("La media es: " + media);

        int superior=0,  inferior=0, igual=0;
        for (double altura : alturas)
            if (altura < media) {
                superior++;
            }
        else if (altura > media) {
            inferior++;
            }
        else igual++;

        System.out.println("Personas con altura mayor a la media: " + superior);
        System.out.println("Personas con altura menor a la media: " + inferior);
        System.out.println("Personas con altura igual a la media: " + igual);


    }

}
