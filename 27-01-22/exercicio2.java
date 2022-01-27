/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package condicaogen;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        int n, par = 0, impar = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.print("Digite um numero: ");
            n = ler.nextInt();

            if (n % 2 == 0) {
                par++;

            } else {
                impar++;
            }
        }
        System.out.println("par: " + par);
        System.out.println("impar: " + impar);
    }
}
