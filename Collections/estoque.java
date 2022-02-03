/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list; .
Atualizar dados da list. .
Apresentar todos os dados da list. .

 FUNÇOES EXTRAS :
Collections.sort(item); // coloca os elementos em ordem alfabetica
System.out.println(item.size()); // retorna a quantidade de elementos da lista
System.out.println(item.contains("Tenis")); // verifica se contem esse item na lista
System.out.println(item.get(2)); // mostra o conteudo do indice indicado
item.clear(); // remove todos elementos da lista   
*/

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class estoque {

    public static void main(String[] args) {

        int est;

        Scanner ler = new Scanner(System.in);
        ArrayList<String> item = new ArrayList<>();

        do {
            System.out.println("|_______________________________________|");
            System.out.println("|............ LOJA GENERATION ..........|");
            System.out.println("|_______________________________________|");

            System.out.println("" 
                    + "|.............. LOJA MENU ..............|"
                    + "\n|[1] - Adicionar produto no estoque.    |"
                    + "\n|[2] - Remover produto do estoque.      |"
                    + "\n|[3] - Atualizar produto do estoque.    |"
                    + "\n|[4] - Mostrar todos os produtos.       |"
                    + "\n|[0] - Sair.                            |");
            System.out.println("|.......................................|");
            System.out.print("Escolha uma opção : ");
            est = ler.nextInt();

            switch (est) {
                case 1:
                    ler.nextLine();
                    System.out.print("\nADICIONANDO...\nAdicione o produto: ");
                    String prod = ler.nextLine();
                    item.add(prod);
                    System.out.print("\nO produto: " + "[" + prod +"]" + " foi adicionado! \n");
                    break;

                case 2:
                    ler.nextLine();
                    System.out.print("\nREMOVENDO...\nDigite o produto para remover: ");
                    String del = ler.nextLine();

                    if (item.contains(del)) {
                        item.remove(del);
                        System.out.print("\nO produto: " + "[" + del +"]" + " foi removido! \n");
                    } else {
                        System.out.println("\nProduto inválido!");
                    }
                    break;
                
                case 3:
                    ler.nextLine();
                    System.out.print("\nATUALIZANDO...\nDigite o produto para atualizar: ");
                    String prod2 = ler.nextLine();
                    System.out.print("Qual produto substituará? ");
                    String prod3 = ler.nextLine();
                   
                    if (item.contains(prod2)) { 
		    item.remove(prod2);
		    item.add(prod3);
	            System.out.println("\nProduto" + "[" + prod2 +"]" + " foi atualizado com sucesso para " + "[" + prod3 +"]");
		    } else {
		    System.out.println("\nProduto inválido!");
		    }
                    break;
                    
                    case 4:
		    ler.nextLine();
		    System.out.print("\nPRODUTOS EM ESTOQUE...");
		    System.out.println("\n" + item);
		    break;
			
                    case 0:
                         System.exit(0);
		    break;
		   
                    default:
		    System.out.println("\nOPÇÃO INVÁLIDA!");
                 }

        } while (est != 0);
        System.out.println("\nSESSÃO FINALIZADA!");
        System.exit(0);
    }
}
