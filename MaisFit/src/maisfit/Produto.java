package maisfit;

public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;
    private String marca;
    private String categoria;
    private static int id;

    
    Produto(){
        Produto.id = Produto.id + 1;
    }
    
    void mostraDadosProduto(){
        
        System.out.println("=-= Dados do Produto =-=");
        System.out.println("Produto: "+this.nome);
        System.out.println("Marca:"+this.marca);
        System.out.println("Categoria:"+this.categoria);
        System.out.println("Valor: "+this.valor);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("---------------");
        
    }

    public static int getId() {
        return Produto.id;
    }
    
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
     
}
