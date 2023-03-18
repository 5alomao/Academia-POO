package maisfit;

public class Funcionario {
   
    private String nome;
    private String cpf;
    private String telefone;
    private String nascimento;
    private String endereco;
    private String ctps;
    private String cargo;
    private static int id;
    
    
    Funcionario(){
        Funcionario.id = Funcionario.id + 1;
    }
    
    void mostraDadosFuncionario(){
        
        System.out.println("=-= Dados do Funcionario =-=");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("CTPS:"+this.ctps);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("---------------");
        
    }

    public static int getId() {
        return Funcionario.id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
    
}
