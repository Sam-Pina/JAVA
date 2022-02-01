package herancaGen;

public class preguica extends animal {
    
    
      public preguica(String nome, int idade) {
        super("Tobias", 8);
    } 
     
    // metodos
    public void subir(){
        System.out.println("A preguica " + getNome() + " está subindo a arvore");
    }
    
    public void som(){
        System.out.println("A preguiça " + getNome() + " está bocejando");
    }
}
