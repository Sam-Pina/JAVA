/*
  Construa um programa em c que, tendo como dados de entrada dois pontos
  quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula:
  D = (X2 - Y1)^2 + (Y2-Y1)^2 TUDO NA RAIZ
  que efetua tal cálculo é:
 */
package javagen;

import java.util.Scanner;

public class exercicio6 {
    
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int x1, y1, x2, y2, pot1, pot2, raiz, P, D;
        
        
        System.out.println("Digite um numero para x1: ");
        x1 = ler.nextInt();
        
        System.out.println("Digite um numero para x2: ");
        x2 = ler.nextInt();
        
        System.out.println("Digite um numero para y1: ");
        y1 = ler.nextInt();
        
        System.out.println("Digite um numero para y2: ");
        y2 = ler.nextInt();
        
        
        
	pot1 = (int) Math.pow(x2 - y1, 2);
	pot2 = (int) Math.pow(x2 - y1 , 2);	

	D = pot1 + pot2;

	raiz = (int) Math.sqrt(2);
        
        
        System.out.println("Resultado: " + D);
    }
}
