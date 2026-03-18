package lista;

import modelo.Produto;
public class No {
    private Produto produto;
    private No prox;

    public No(No prox, Produto produto) {
        this.prox = prox;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
