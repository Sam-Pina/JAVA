/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package javagen;

import java.util.Scanner;

public class exercicio8 {
    
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
        
    
    int custoFabrica, custoConsumidor, pTotal;
    int distr = 28, impostos = 45;
    
    pTotal = distr + impostos; 
    
    System.out.println("Digite o valor de fabrica de carro: ");
    custoFabrica = ler.nextInt();
    
    custoConsumidor = custoFabrica + ((pTotal * custoFabrica) / 100);

    pTotal = custoConsumidor - custoFabrica;
    
    System.out.println("Total pago no veiculo: " + custoConsumidor);
    System.out.println("Valor dos impostos: " + pTotal);   
 }
}