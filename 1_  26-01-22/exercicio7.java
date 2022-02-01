/*
7. Um sistema de equações lineares do tipo, pode ser resolvido segundo mostrado abaixo :
x = ce - bf / ae - bd, y = af - cd / ae - bd
Escreva um sistema que lê os coeficientes a,b,c,d,ee e f e calcula e mostra os valores de x e y.
*/
package javagen;

import java.util.Scanner;

public class exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, d, ee, f, x, y;
        
        System.out.println("Digite um valor para A: ");
        a = ler.nextInt();
        
        System.out.println("Digite um valor para B: ");
        b = ler.nextInt();
        
        System.out.println("Digite um valor para C: ");
        c = ler.nextInt();
        
        System.out.println("Digite um valor para D: ");
        d = ler.nextInt();
        
        System.out.println("Digite um valor para EE: ");
        ee = ler.nextInt();
        
        System.out.println("Digite um valor para F: ");
        f = ler.nextInt();
        
        
        x = ((c * ee) - (b * f) / (a * ee) - (b * d));
	y = ((a * f) - (c * d) / (a * ee) - (b * d));
        
        
        System.out.println("Resultado de X: "  + x);
        System.out.println("Resultado de X: "  + y);
  }
}
