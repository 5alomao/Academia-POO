package maisfit;

public class Funcionario extends Pessoa{

    private String ctps;
    private int codFuncionario;
    private static int cont;
    Cargo cargo;
    
    
    public static int getCont() {
        return Funcionario.cont;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    
    Funcionario(Cargo c){
        Funcionario.cont = Funcionario.cont + 1;
        this.codFuncionario = cont;
        this.cargo = c;
    }  
    
    void mostraDadosFuncionario(){
        
        System.out.println("=-= Dados do Funcionario =-=");
        System.out.println("Código do Funcionário: "+this.codFuncionario);
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Cargo:"+this.cargo.getTipo());
        System.out.println("Salário:"+this.cargo.getSalario());
        System.out.println("CTPS:"+this.ctps);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("---------------");
        
    }
    
    public double getBonificacao(){
        return this.cargo.getSalario() * 0.10;
    }
    
    void alteraSalario(double alteracao){
        cargo.setSalario(cargo.getSalario()+alteracao);
        System.out.println("Salário Alterado !");
    }
}
