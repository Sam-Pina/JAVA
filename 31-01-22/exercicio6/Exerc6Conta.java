package PooGen;

public class Exerc6Conta {
    
    public static void main(String[] args) {

		Exerc6 c1 = new Exerc6("Samuel", 1500);

		c1.ConsultarSaldo();
		c1.Sacar(1500);
		c1.Depositar(10000);
	}
}
