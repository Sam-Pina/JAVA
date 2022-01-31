/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package PooGen;

public class Exerc5 {
    
    //ATRIBUTOS
    String marca, cor;
    int qtdRodas;   
    boolean freio = true;
    float preco;
    
    //CONSTRUTOR
     public Exerc5(String marca, String cor, int qtdRodas, boolean freio, float preco){
        
        this.marca = marca;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.freio = freio; 
        this.preco = preco;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public boolean isFreio() {
        return freio;
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }
    
    //METODOS
    public void preco(){
        if(preco > 1000){
            System.out.println("Produto novo");
        }else if(preco > 3000 && preco < 800){
            System.out.println("Preco bom");
        }else{
            System.out.println("Produto usado");
        }
    }
   
   
    public void status(){
        System.out.println("\tDados do Patinete");
        System.out.println("\nA marca do patinete é: " + marca);
        System.out.println("A cor do patinete é: " + cor);
        System.out.println("A quantidade de rodas são: " + qtdRodas );
        System.out.println("Seu patinete tem freio ? " + freio);
        System.out.println("O preco é: " + preco);
    }
}
