/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package javagen;

import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[] args) {
        
        int tempoHoras, tempoMinutos, tempoSegundos;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o tempo de duração do evento em segundos: ");
        tempoSegundos = ler.nextInt();
        
        
        tempoHoras = tempoSegundos / 3600; // 60x60 = 3600  = 1hora

	tempoMinutos = (tempoSegundos % 3600) / 60; // calculo para dar o valor total em minutos

	tempoSegundos = tempoSegundos ;
        
        
        System.out.println("O total de horas desse evento é: " + tempoHoras + "\nO total de minutos desse evento é: " + tempoMinutos + 
		           "\nO total de segundos desse evento é: " + tempoSegundos);
    }
}

