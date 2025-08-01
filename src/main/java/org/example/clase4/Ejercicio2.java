package org.example.clase4;
/*Programa que genera un array de 8 enteros aleatorios entre 1 y 10,
lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        final int TOTAL_NUMEROS = 8;
        int[] numeros = new int[TOTAL_NUMEROS];

        generarNumerosAleatorios(numeros, 1, 10);  // Llena el array con números aleatorios

        System.out.println("Array original:");
        mostrarArray(numeros);

        ordenarBurbuja(numeros);  // Ordena el array

        System.out.println("\nArray ordenado:");
        mostrarArray(numeros);
    }

    // Genera números aleatorios con Math.random()
    public static void generarNumerosAleatorios(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    // Burbuja
    public static void ordenarBurbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Muestra el array
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

