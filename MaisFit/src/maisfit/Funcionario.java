package maisfit;

public class Funcionario {
   
    private String nome;
    private String cpf;
    private String telefone;
    private String nascimento;
    private String endereco;
    private String ctps;
    private int codFuncionario;
    private static int cont;
    Cargo cargo;
    
    public static int getCont() {
        return Funcionario.cont;
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
    
    Funcionario(Cargo c){
        Funcionario.cont = Funcionario.cont + 1;
        this.codFuncionario = cont;
        this.cargo = c;        
    }  
    
    void mostraDadosFuncionario(){
        
        System.out.println("=-= Dados do Funcionario =-=");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Cargo:"+this.cargo.getTipo());
        System.out.println("CTPS:"+this.ctps);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("---------------");
        
    }
    
}
