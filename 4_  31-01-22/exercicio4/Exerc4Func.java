
package PooGen;

public class Exerc4Func {
    
    public static void main(String[] args) {
		Exerc4 f1 = new Exerc4("Samu", 19, "Administrativo", 60);

		f1.calculaSalario();
		f1.imprime();
		System.out.println("\nAumentando o salario em 50%:\n ");
		f1.aumentaSalario(50);
		f1.imprime();
	}

}
