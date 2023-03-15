package maisfit;

public class Venda {
    
    private double formaPagamento;
    private double desconto;
    private String dataVenda;
    private int quantidade;

    public double getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(double formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
}
