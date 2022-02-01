package herancaGen;

public class cachorro extends animal{
    
    public cachorro(String nome, int idade) {
        super("toto", 12);
    } 
    
    
    // metodos
    public void correr(){
        System.out.println("O cachorro " + getNome() + " está correndo");
    }
    
    public void som(){
        System.out.println("O cachorro " + getNome()  + " emite o som 'Au au' ");
    }
    
    
    
}
