/*
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package PooGen;

public class Exerc7 {

    //ATRIBUTOS
    String nome;
    int idade;   
    boolean grave = true;
    boolean plano = true;
    
    //CONSTRUTOR
     public Exerc7(String nome, int idade, boolean grave, boolean plano){
        
        this.nome = nome;
        this.idade = idade;
        this.grave = grave;
        this.plano = plano; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isGrave() {
        return grave;
    }

    public void setGrave(boolean grave) {
        this.grave = grave;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }
    
    //METODOS
    public void grave(){
        if(grave = true){
            System.out.println("Precisa ser atendido urgentemente!");
        }else if(grave = false){
            System.out.println("Aguarde pela odem marcada");
        }
    }
   
   
    public void status(){
        System.out.println("\tDados do Paciente");
        System.out.println("\nO nome do paciente é: " + nome);
        System.out.println("A idade do paciente é: " + idade);
        System.out.println("O estado do paciente é grave?: " + grave);
        System.out.println("O paciente tem plano de saude?: " + plano);
       
    }
}
