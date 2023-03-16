package maisfit;

public class Funcionario {
   
    private String nome;
    private String cpf;
    private String telefone;
    private String nascimento;
    private String endereco;
    private String ctps;
    Cargo cargo = new Cargo();

    
    void mostraDadosFuncionario(){
        
        System.out.println("=-= Dados do Funcionario =-=");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Cargo: "+this.cargo.getCargo());
        
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
      
}
