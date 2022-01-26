/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package javagen;

import java.util.Scanner;

public class exercicio1 {


  public static void main(String[] args) {
       
        int idadeAnos, idadeMeses, idadeDias, diasTotais = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a sua idade atual: ");
        idadeAnos = ler.nextInt();
        
        System.out.println("Digite quantos meses: ");
        idadeMeses = ler.nextInt();
        
        System.out.println("Digite quantos dias: ");
        idadeDias = ler.nextInt();
        
        diasTotais = diasTotais + (idadeAnos * 365);
        diasTotais = diasTotais + (idadeMeses * 30);
        diasTotais = diasTotais + idadeDias;
        
        System.out.println("O total de dias dessa pessoa é: " + diasTotais);
    }
    
}
