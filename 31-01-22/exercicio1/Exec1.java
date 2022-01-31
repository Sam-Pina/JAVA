/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package PooGen;

public class Exec1 {
    
    //ATRIBUTOS
    String nome;
    String sobrenome;
    int idade;
    float peso;
    float altura;
    
    //CONSTRUTOR
    public Exec1(String nome, String sobrenome, int idade, float peso, float altura){
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;             
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    //METODOS
    public void comprar(){
        
        if(idade > 10 && idade < 18){
            System.out.println("Ele compra jogos");
        }else if(idade >= 18 ){
             System.out.println("Ele compra carros");
        }else{
             System.out.println("O que ele quiser");
        }
    }
   
    public void status(){
        System.out.println("\tDados do cliente");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Sobrenome do cliente: " + sobrenome);
        System.out.println("Idade do cliente: " + idade);
        System.out.println("Peso do cliente: " + peso);
        System.out.println("Altura do cliente: " + altura);
    }
    
}
