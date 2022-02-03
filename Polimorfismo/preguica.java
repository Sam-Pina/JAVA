package polimorfismo;

public class preguica extends animal {

    public preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        System.out.println("A preguiça " + getNome() + " está fazendo som ");
    }

    @Override
    public void correr() {
        System.out.println("A preguiça " + getNome() + " não corre mermão");
    }

    @Override
    public void subirArvore() {
        System.out.println("A preguiça " + getNome() + " está subindo na Arvore");
    }
    
}
