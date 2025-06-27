package Model;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorPar = 0;
        int sumaNgeativa = 0;
        int contardorImpar = 0;
        int suma = 0;
        double mitad = 0;

        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();
        System.out.println("\nLos números que ingresaste son: ");

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPar++;
            }else{
                contardorImpar++;
            }
            if(num >= 0) {
                suma += num;
                mitad = suma /2;
            } else if (num <0) {
                sumaNgeativa += num;

            }
            {

            }

        }
        System.out.println(" ");

        System.out.println("Cantidad de números pares: " + contadorPar);
        System.out.println("Cantidad de números impares: " + contardorImpar);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La suma de los numeros negativos: " + sumaNgeativa);
        System.out.println("La mitad: " + mitad);
        sc.close();
    }
}