package modelo;

public class Produto {
    private String nome;
    private double preco;
    private int id;

    private static int cont=1; //variavel classe // Variável de classe (estática) - compartilhada por todos os Produtos


    // Construtor padrão (sem argumentos)
    public Produto() {
        this.id = cont++; // Agora o nome da variável bate com a declaração acima
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }
}
