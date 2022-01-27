/*
 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
package condicaogen;

import java.util.Scanner;

public class exercicio6 {
     
    public static void main(String[] args) {
         
        Scanner ler = new Scanner(System.in);
        
        int n, media, soma = 0, cont = 0;
        
        System.out.print("Digite um numero: ");
        n = ler.nextInt();
       
        if(n % 3 == 0){
              soma = soma + n;
             
          }
        
        do{
           System.out.print("Digite um numero: ");
           n = ler.nextInt();
           
          if(n % 3 == 0){
              soma = soma + n;
              cont++;
          }
               
          media = soma / cont;
          
        }while( n != 0);
        System.out.println("A quantidade de numeros multiplos de 3: " + cont);
        System.out.println("A soma dos numeros digitados: " + soma);
        System.out.println("A media dos numeros digitados: " + media);
     }
}
