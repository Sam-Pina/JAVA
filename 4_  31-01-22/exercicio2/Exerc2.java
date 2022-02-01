/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package PooGen;


public class Exerc2 {
    
    //ATRIBUTOS
    int qtdAcento, numPassageiros;
    String nomeEmpresa;
    float qtdCombustivel,consumoCombustivel;
    
    //CONSTRUTOR
    public Exerc2(int qtdAcento, int numPassageiros, String nomeEmpresa, float qtdCombustivel, float consumoCombustivel){
        
        this.qtdAcento = qtdAcento;
        this.numPassageiros = numPassageiros;
        this.nomeEmpresa = nomeEmpresa;
        this.qtdCombustivel = qtdCombustivel;
        this.consumoCombustivel = consumoCombustivel;  
        
    }

    public int getQtdAcento() {
        return qtdAcento;
    }

    public void setQtdAcento(int qtdAcento) {
        this.qtdAcento = qtdAcento;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public float getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(float consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
    
    //METODOS
    public void cheio(){
        if(numPassageiros > 100){
            System.out.println("Aviao cheio");
        }
    }
    
    public void vazio(){
        if(numPassageiros < 50){
            System.out.println("Aviao vazio");
        }
    }
   
    public void status(){
        System.out.println("\tDados do Avião");
        System.out.println("\nO nome da empresa é: " + nomeEmpresa);
        System.out.println("A quantidade de acentos são: " + qtdAcento);
        System.out.println("O numero de passageiros são: " + numPassageiros);
        System.out.println("A quantidade de combustivel é: " + qtdCombustivel);
        System.out.println("O consumoCombustivel é: " + consumoCombustivel);
    }
}
