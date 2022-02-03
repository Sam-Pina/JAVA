package polimorfismo;

public class cavalo extends animal {

    public cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        System.out.println("O cavalo " + getNome() + " está relinchando");
    }

    @Override
    public void correr() {
        System.out.println("Pocotó Pocotó, o cavalo " + getNome() + " está correndo ");
    }

    @Override
    public void subirArvore() {
        System.out.println("O cavalo " + getNome() + " não sobe em arvore meu mermão ");
    }
    
}
