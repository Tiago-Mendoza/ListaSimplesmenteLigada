package principal;

import lista.Lista;
import modelo.Produto;

public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserir(new Produto("Café", 40.34f));
        lista.inserir(new Produto("Azeite", 38.67f));
        lista.inserir(new Produto("Arroz", 25.78f));


        System.out.println("Lista:");
        lista.exibir();


        System.out.println("\nPesquisa:");
        Produto p = lista.pesquisar(1);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Produto não encontrado");
        }

        System.out.println("\nAtualização:");
        boolean atualizado = lista.atualizar(1, 50.0f);

        if (atualizado) {
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("Produto não encontrado");
        }

        System.out.println("\nLista atualizada:");
        lista.exibir();


        System.out.println("\n Remover nó da lista");

        if(lista.remover(5)){
            lista.exibir();
        } else{
            System.out.println("\n Não Achou o ID Pesquisado");
        }
        System.out.println("\n Remoção Concluida");

        System.out.println("\n ----- Atualizando preço da Lista ------");
        lista.atualizarLista(10);
        lista.exibir();
    }
}


