/*
3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
package condicaogen;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade = 0, mais = 0, menos = 0;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        while (idade != -99) {

            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();

            if (idade < 21) {
                menos++;
            }

            if (idade > 50) {
                mais++;
            }
        }
        System.out.println("o total de pessoas com menos de 21 anos: " + menos);
        System.out.println("o total de pessoas com mais de 50 anos: " + mais);
    }
}
