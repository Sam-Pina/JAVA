/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/

package javagen;

import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args) {
            
        int a,b,c,d,r,s;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite um numero para A: ");
        a = ler.nextInt();
        
        System.out.println("Digite um numero para B: ");
        b = ler.nextInt();
        
        System.out.println("Digite um numero para C: ");
        c = ler.nextInt();
        
        r = (int) Math.pow(a + b , 2);

        s = (int) Math.pow(b + c , 2);

        d = (r + s) / 2 ;
               
        System.out.println("Resultado : " + d);
    }
}

