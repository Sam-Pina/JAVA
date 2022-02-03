package polimorfismo;

public class bichos {
    
      public static void main(String[] args) {
          
          
          cachorro c = new cachorro("SOUZA", 10);
          cavalo  ca = new cavalo("Troia", 12);
          preguica p = new preguica("Rodorfo", 20);
          
          
          c.som();
          c.correr();
          c.subirArvore();
          System.out.println("\n");
          ca.som();
          ca.correr();
          ca.subirArvore();
          System.out.println("\n");
          p.som();
          p.correr();
          p.subirArvore();
          
      }
}
