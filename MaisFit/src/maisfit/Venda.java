package maisfit;

public class Venda {
    
    private String formaPagamento;
    private int desconto;
    private String dataVenda;
    private int quantidade;
    private int codVenda;
    Produto p;
    Plano plan;
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
   
    Venda(){
        Venda.cont = Venda.cont + 1 ;
        this.codVenda = cont;
    }
    
    Venda(Produto prod){
        this();
        p = prod;
    }
    
    Venda(Plano pla){
        this();
        plan = pla;
    }
    
    void mostraVendaProd(){
        
        double res;
        res = p.getValor() - (p.getValor() * desconto)/100;
        System.out.println("=-= Dados da Venda =-=");
        System.out.println("Forma de Pagamento: "+this.formaPagamento);
        System.out.println("Desconto: "+this.desconto);
        System.out.println("Data da Venda: "+this.dataVenda);
        System.out.println("Quantidade:"+this.quantidade);
        System.out.println("Produto: "+p.getNome());
        p.setValor(res*quantidade);
        System.out.println("Valor: "+p.getValor());
        System.out.println("---------------");
        
    }
    
    void mostraVendaPlan(){
        
        double res;
        res = plan.getValor() - (plan.getValor() * desconto)/100;
        System.out.println("=-= Dados da Venda =-=");
        System.out.println("Forma de Pagamento: "+this.formaPagamento);
        System.out.println("Desconto: "+this.desconto);
        System.out.println("Data da Venda: "+this.dataVenda);
        System.out.println("Quantidade:"+this.quantidade);
        System.out.println("Produto: "+plan.getTipo());
        plan.setValor(res*quantidade);
        System.out.println("Valor: "+plan.getValor());
        System.out.println("---------------");
        
    }
    
}
