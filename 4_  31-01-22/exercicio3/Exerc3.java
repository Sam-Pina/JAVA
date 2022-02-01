/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */
package PooGen;

public class Exerc3 {
    
    //ATRIBUTOS
    
    String nome, modelo, tipo;
    float preco;
    boolean ligado = true;
    
    
    public Exerc3(String nome, String modelo, String tipo, float preco, boolean ligado){
        
        this.nome = nome;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.ligado = ligado;  
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    //METODOS
    public void preco(){
        if(preco > 1000){
            System.out.println("Preco razoavel");
        }else if(preco <= 100){
            System.out.println("Produto usado");
        }
    }
   
   
    public void status(){
        System.out.println("\tDados do Produto");
        System.out.println("\nO nome da empresa é: " + nome);
        System.out.println("A quantidade de acentos são: " + modelo);
        System.out.println("O numero de passageiros são: " + tipo);
        System.out.println("A quantidade de combustivel é: " + preco);
        System.out.println("O consumoCombustivel é: " + ligado);
    }
}
