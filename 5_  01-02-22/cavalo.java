package herancaGen;

public class cavalo extends animal {
     
    public cavalo(String nome, int idade) {
        super("Pegasus", 10);
    } 
     
    // metodos
    public void correr(){
        System.out.println("O cavalo " + getNome() + " está correndo");
    }
    
    public void som(){
        System.out.println("O cavalo " + getNome() + " relinchou");
    }
}
