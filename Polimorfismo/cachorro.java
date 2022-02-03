package polimorfismo;

public class cachorro extends animal {
    
    public cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        System.out.println("O cachorro " + getNome() + " está latindo... ");
    }   

    @Override
    public void correr() {
        System.out.println("O cachorro " + getNome() + " está correndo...");
    }

    @Override
    public void subirArvore() {
        System.out.println("O cachorro não " + getNome() + " sobe em árvore mermão!!");
    }
    
}
