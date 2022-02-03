/*
1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */
package polimorfismo;
 
public abstract class animal {
    
    private String nome;
    private int idade;
    
    //CONSTRUTOR
    public animal(String nome, int idade){
        
        this.nome = nome;   
        this.idade = idade;            
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
    
    
    
    public abstract void som();
    public abstract void correr();
    public abstract void subirArvore();
    
}
