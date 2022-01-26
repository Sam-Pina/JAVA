/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package javagen;

import java.util.Scanner;

public class exercicio2 {
     public static void main(String[] args) {
         
         int idadeAnos, idadeMeses, idadeDias;
         
         Scanner ler = new Scanner(System.in);
         
         
         System.out.println("Digite quantos anos voce tem em dias: ");
         idadeDias = ler.nextInt();
         
         idadeAnos = idadeDias / 365; // coverte anos em dias

	 idadeMeses = idadeDias / 30; // coverte meses em dias

	 idadeDias = idadeDias;
         
         System.out.println("O total de anos dessa pessoa é: " + idadeAnos + "\nO total de meses dessa pessoa é: " + idadeMeses + 
		"\nO total de dias dessa pessoa é: " + idadeDias);
         
     }
}

