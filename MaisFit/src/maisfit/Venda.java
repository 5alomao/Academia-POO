package maisfit;

import java.util.List;

public class Venda {
    
    private String formaPagamento;
    private int desconto;
    private String dataVenda;
    private int quantidade;
    private int codVenda;
    Produto p;
    Plano plan;
    Cliente cli;
    private static int cont;
    
    public static int getCont() {
        return Venda.cont;
    }
    
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
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

    public int getCodVenda() {
        return codVenda;
    }
    
    Venda(Cliente c, Produto prod){
        Venda.cont = Venda.cont + 1 ;
        this.codVenda = cont;
        this.cli = c;
        this.p = prod;
    }
    
    Venda(Cliente c, Plano plan){
        Venda.cont = Venda.cont + 1 ;
        this.codVenda = cont;
        this.cli = c;
        this.plan = plan;
    }
    
    void listarVendaProd(){
        
        double res;
        res = p.getValor() - (p.getValor() * desconto)/100;
        System.out.println("=-= Dados da Venda =-=");
        System.out.println("Código do Venda: "+this.codVenda);
        System.out.println("Cliente: "+this.cli.getNome());
        System.out.println("Forma de Pagamento: "+this.formaPagamento);
        System.out.println("Desconto: "+this.desconto);
        System.out.println("Data da Venda: "+this.dataVenda);
        System.out.println("Quantidade:"+this.quantidade);
        System.out.println("Produto: "+p.getNome());
        p.setValor(res*quantidade);
        System.out.println("Valor: "+p.getValor());
        System.out.println("---------------");
        
    }
    
    void listarVendaPlan(){
        
        double res;
        res = plan.getValor() - (plan.getValor() * desconto)/100;
        System.out.println("=-= Dados da Venda =-=");
        System.out.println("Código do Venda: "+this.codVenda);
        System.out.println("Cliente: "+this.cli.getNome());
        System.out.println("Forma de Pagamento: "+this.formaPagamento);
        System.out.println("Desconto: "+this.desconto);
        System.out.println("Data da Venda: "+this.dataVenda);
        System.out.println("Quantidade:"+this.quantidade);
        System.out.println("Produto: "+plan.getTipo());
        plan.setValor(res*quantidade);
        System.out.println("Valor: "+plan.getValor());
        System.out.println("---------------");
        
    }
    void tipoVenda(){
        double res;
        if(plan != null){
            res = plan.getValor() - (plan.getValor() * desconto)/100; 
            System.out.println("Plano: " + plan.getTipo());
            plan.setValor(res * quantidade);
            System.out.println("Valor: " + plan.getValor());
            System.out.println("---------------");
        }else if(p != null){
            res = p.getValor() - (p.getValor() * desconto)/100;
            System.out.println("Produto: " + p.getNome());
            p.setValor(res * quantidade);
            System.out.println("Valor: " + p.getValor());
            System.out.println("---------------");
        }
    }
    
    public static void listarVendas(List<Venda> listVenda){
        for(Venda venda : listVenda){
            double res;
            System.out.println("=-= Dados da Venda =-=");
            System.out.println("Código do Venda: "+venda.getCodVenda());
            System.out.println("Cliente: "+venda.cli.getNome());
            System.out.println("Forma de Pagamento: "+venda.getFormaPagamento());
            System.out.println("Desconto: "+venda.getDesconto());
            System.out.println("Data da Venda: "+venda.getDataVenda());
            System.out.println("Quantidade: "+venda.getQuantidade());
            venda.tipoVenda();
        }
    }
}
