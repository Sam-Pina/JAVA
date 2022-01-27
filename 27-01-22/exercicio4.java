/*
4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */
package condicaogen;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int pessoas = 0, idade = 0, sexo, comportamento;
        int pCalmo = 0, mNerv = 0, hAgre = 0, oCalmo = 0, n40 = 0, c18 = 0;

        while (pessoas != 3) {
            pessoas++;

            System.out.print("\nDigite sua idade: ");
            idade = ler.nextInt();

            System.out.print("Digite seu sexo: ");
            System.out.println("\n1- feminino " + "\n2- masculino " + "\n3- Outros: ");
            sexo = ler.nextInt();

            System.out.print("Digite seu comportamento: ");
            System.out.println("\n1- pessoa calma" + "\n2- pessoa nervosa" + "\n3- pessoa agressiva");
            comportamento = ler.nextInt();

            switch (sexo) {
                case 1:
                    System.out.println("Genero - Feminino");
                    break;
                case 2:
                    System.out.println("Genero - Masculino");
                    break;
                case 3:
                    System.out.println("Genero - Outros");
                    break;
            }

            switch (comportamento) {
                case 1:
                    System.out.println("Comportamento - Calmo/a)");
                    break;

                case 2:
                    System.out.println("Comportamento - Nervoso/a");
                    break;
                case 3:
                    System.out.println("Comportamento - Agressivo/a");
                    break;
            }

            if (comportamento == 1) {
                pCalmo++;
            } else if (sexo == 1 && comportamento == 2) {
                mNerv++;
            } else if (sexo == 2 && comportamento == 3) {
                hAgre++;
            } else if (sexo == 3 && comportamento == 1) {
                oCalmo++;
            } else if (idade >= 40 && comportamento == 2) {
                n40++;
            } else if (idade <= 18 && comportamento == 1) {
                c18++;
            }
        }
        System.out.println("A quantidade de pessoas calmas: " + pCalmo);
        System.out.println("A quantidade de mulheres nervosas: " + mNerv);
        System.out.println("A quantidade de homens agressivos: " + hAgre);
        System.out.println("A quantidade de outros calmos: " + oCalmo);
        System.out.println("A quantidade de pessoas nervosas maiores de 40anos: " + n40);
        System.out.println("A quantidade de pessoas calmas menores de 18: " + c18);
        System.out.println("A quantidade de pessoas: " + pessoas);
    }
}
