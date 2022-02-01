/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */
package vetorMatriz;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        int[] n = new int[6];
        int soma = 0, quantp = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            n[i] = ler.nextInt();

            if (n[i] % 2 == 0) {
                soma = soma + n[i];
            }

            if (n[i] % 2 == 1) {
                quantp++;
            }

        }
        System.out.println("\nPares:");
        for (int i = 0; i <= 5; i++) {
            if (n[i] % 2 == 0) {
                System.out.println(n[i]);
            }
        }
        System.out.println("\nImpares:");
        for (int i = 0; i <= 5; i++) {
             if (n[i] % 2 == 1) {
                System.out.println(n[i]);

            }
        }
        System.out.println("\nA soma dos numeros pares sao: " + soma);
        System.out.println("A quantidade de numeros impares sao: " + quantp);
    }
}
