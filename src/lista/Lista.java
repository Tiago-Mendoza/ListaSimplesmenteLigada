package lista;

import modelo.Produto;

public class Lista {

    private No inicio, auxiliar, atual;

    /**
     * Insere nó no final da lista simplesmente ligada
     * @param produto Produto
     */
    public void inserir(Produto produto){
        // Quando a lista estiver vazia
        if(inicio == null){
            inicio = new No(produto, null);
            auxiliar = inicio;
        }
        else {
            // Quando a lista não estiver vazia
            atual = new No(produto, null);
            auxiliar.setProx(atual);
            auxiliar = atual;
        }
    }

    /**
     * Exibe todos os produtos da lista
     */
    public void exibir(){
        No e = inicio;
        while(e != null){
            System.out.println(e.getProduto());
            e = e.getProx();
        }
    }


    // NOVAS MODIFICAÇÕES ABAIXO


    public Produto pesquisar(int id) {
        No e = inicio;
        while (e != null) {
            if (e.getProduto().getId() == id) {
                return e.getProduto();
            }
            e = e.getProx();
        }
        return null;
    }

    // NOVAS MODIFICAÇÕES ABAIXO

    public boolean atualizar(int id, float preco) {
        Produto p = pesquisar(id);

        if (p != null) {
            p.setPreco(preco);
            return true;
        }
        return false;
    }
}