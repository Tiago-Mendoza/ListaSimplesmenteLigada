package lista;

import modelo.Produto;

public class Lista {
    private No inicio, aux, atual;

    /**
     * Insere nó no final da lista simplesmente ligada
     * @param produto Produto
     */
    public void inserir(Produto produto) {
        // Quando a lista estiver vazia
        if(inicio == null){
            inicio=new No(produto, null);
            aux=inicio;
        } else { // Quando a lista não estiver vazia
            atual = new No(produto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }
    public void exibir() {
        No e = inicio;
        while (e != null) {
            System.out.println(e.getProduto());
            e = e.getProx();
        }
    }

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
    public boolean atualizar(int id, float preco) {
        No e = inicio;

        while (e != null) {
            if (e.getProduto().getId() == id) {
                e.getProduto().setPreco(preco);
                return true;
            }
            e = e.getProx();
        }
        return false;
    }

    public boolean remover(int id){
        // Pesquisar
        No remov = inicio, anterior = inicio;
        while(remov != null){

            if(id == remov.getProduto().getId()){
                break;
            }
            anterior = remov;
            remov = remov.getProx();
        }

        if(remov != null){
            // Remover o nó da lista
            if(remov == inicio){ // 1° Caso - Remoção do primeiro nó
                inicio = remov.getProx();
                remov.setProx(null);
            } else if(remov==atual){ // 2° Caso - Remoção do ultimo nó
                atual = anterior;
                aux = anterior;
                anterior.setProx(null);
            } else { // 3° Caso - Remoção de um nó qualquer
                anterior.setProx(remov.getProx());
                remov.setProx(null);
            }

            return true;
        }
        return false;
    }
//Atividade 4--
    public void limparLista(){
        inicio = null;
        aux = null;
        atual = null;
    }

    public void atualizarLista(float p) {
        No e = inicio;

        while (e != null) {
            Produto prod = e.getProduto();

            float novoPreco = prod.getPreco() + (prod.getPreco() * p / 100);
            prod.setPreco(novoPreco);

            e = e.getProx();
        }
    }

}