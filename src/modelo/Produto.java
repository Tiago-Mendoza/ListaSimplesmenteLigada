package modelo;

public class Produto {

    private String nome;
    private float preco;
    private int id;
    private static int cont = 1;

    // Construtor padrão que gerencia o ID
    public Produto() {
        this.id = cont++;
    }

    // Construtor completo: chama o de cima para garantir o ID e preenche o resto
    public Produto(String nome, float preco) {
        this(); // Chama o construtor Produto() para incrementar o ID
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Corrigido de Double para float
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produto{ID: " + id + ", Nome: " + nome + ", Preço: " + preco + "}";
    }
}