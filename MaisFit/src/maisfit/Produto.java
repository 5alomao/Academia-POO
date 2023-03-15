package maisfit;

public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;
    Categoria categoria = new Categoria();
    Marca marca = new Marca();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
     
}
