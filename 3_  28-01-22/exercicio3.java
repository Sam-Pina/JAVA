/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package vetorMatriz;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        int[][] valor = new int[3][3];
        int maior = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Digite um numero: ");
                valor[i][j] = ler.nextInt();

                if (valor[i][j] > 10) {
                    maior++;
                }
            }
        }
        System.out.println("A quantidade de numero maior que 10 é: " + maior);
    }
}
