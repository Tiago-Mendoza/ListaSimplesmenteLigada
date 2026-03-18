package lista;

import modelo.Produto;

public class Lista {
    private No inicio, aux, atual;

    public void inserir(Produto produto){
        //Quando lista estiver vazia
        if(inicio==null){
            inicio=new No(produto,null);
            aux=inicio;
        }else {//quando a lista não estiver vazia
            atual = new No(produto,null);
            atual.setProx(atual);
            aux=atual;
        }
    }
}
