/*
5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
package condicaogen;

import java.util.Scanner;

public class exercicio5 {
    
     public static void main(String[] args) {
         
         
         Scanner ler = new Scanner(System.in);
         
         int n, soma = 0;
        
         do{
        
         System.out.print("Digite um numero: ");
         n = ler.nextInt();
         
         soma = soma + n;
         
         }while(n != 0);
         System.out.println("A soma dos valores digitados é: " + soma);
     }
}
