package maisfit;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String nascimento;
    private String endereco;
    private static int id;

    
    Cliente(){
        Cliente.id = Cliente.id + 1;
    }

    void mostraDadosCliente(){
        
        System.out.println("=-= Dados do Cliente =-=");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("---------------");
        
    }
    
    public static int getId() {
        return Cliente.id;
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
    
}
