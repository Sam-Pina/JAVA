package herancaGen;

public class bichos {
    
    public static void main(String[] args) {
        
        
       cachorro a1 = new cachorro("Toto", 12);
       cavalo a2 = new cavalo("Pegasus", 10);
       preguica a3 = new preguica("Tobias", 8);
               
        a1.correr();
        a2.correr();
        a3.subir();
        a1.som();
        a2.som();
        a3.som();
       
    }
}
