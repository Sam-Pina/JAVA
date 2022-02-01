/*
1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
*/
package condicaogen;

public class exercicio1 {
    
    public static void main(String[] args) {
        
        for (int i = 1000; i< 2000; i++){
            if(i%11==5){
                 System.out.println("imprima " + i);
            }        
        }
    }
}
