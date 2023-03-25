package maisfit;

import java.util.List;

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

    public int getCodProduto() {
        return codProduto;
    }
    
    Produto(Categoria c, Marca m){
        Produto.cont = Produto.cont + 1;
        this.codProduto = cont;
        this.categoria = c;
        this.marca = m;
    }
    
    public static void listarProdutos(List<Produto> listProduto){
        for(Produto produto : listProduto){
            System.out.println("=-= Dados do Produto =-=");
            System.out.println("Código do Produto: "+produto.getCodProduto());
            System.out.println("Produto: "+produto.getNome());
            System.out.println("Marca:"+produto.marca.getMarca());
            System.out.println("Categoria:"+produto.categoria.getCategoria());
            System.out.println("Valor: "+produto.getValor());
            System.out.println("Quantidade: "+produto.getQuantidade());
            System.out.println("---------------");
        }
    }
    
}
