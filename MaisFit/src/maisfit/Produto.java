package maisfit;

public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;
    private static int cont;
    private int codProduto;
    Categoria categoria;
    Marca marca;

    public static int getCont() {
        return Produto.cont;
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
    
    Produto(Categoria c, Marca m){
        Produto.cont = Produto.cont + 1;
        this.codProduto = cont;
        this.categoria = c;
        this.marca = m;
    }
    
    void mostraDadosProduto(){
        
        System.out.println("=-= Dados do Produto =-=");
        System.out.println("Produto: "+this.nome);
        System.out.println("Marca:"+this.marca.getMarca());
        System.out.println("Categoria:"+this.categoria.getCategoria());
        System.out.println("Valor: "+this.valor);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("---------------");
        
    }
    
}
