/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

package javagen;

import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {
        
        int n1,n2,n3, media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextInt();
        
         media = n1 + n2 ;
         media = media + n3;
         media = media /3;

        System.out.println("A nota final do aluno foi: " + media);
    }
    
}
