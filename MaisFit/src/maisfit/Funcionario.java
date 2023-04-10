package maisfit;

import java.util.List;

abstract public class Funcionario extends Pessoa{

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

    public int getCodFuncionario() {
        return codFuncionario;
    }
    
    Funcionario(Cargo c){
        Funcionario.cont = Funcionario.cont + 1;
        this.codFuncionario = cont;
        this.cargo = c;
    }  
    
    public static void mostrarFuncionarios(List<Funcionario> listFuncionario){
        for(Funcionario funcionario : listFuncionario){
            System.out.println("=-= Dados do Funcionario =-=");
            System.out.println("Código do Funcionário: "+funcionario.getCodFuncionario());
            System.out.println("Nome: "+funcionario.getNome());
            System.out.println("CPF: "+funcionario.getCpf());
            System.out.println("Cargo:"+funcionario.cargo.getTipo());
            System.out.println("Salário:"+funcionario.cargo.getSalario());
            System.out.println("CTPS:"+funcionario.getCtps());
            System.out.println("Telefone: "+funcionario.getTelefone());
            System.out.println("Endereço: "+funcionario.getEndereco());
            System.out.println("Data de Nascimento: "+funcionario.getNascimento());
            System.out.println("---------------");
        }
    }
    
    abstract public double getBonificacao();
   
}
