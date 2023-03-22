package maisfit;

public class Gerente extends Funcionario {
    private int senha;
    private int numFuncGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
    
    public Gerente(Cargo c) {
        super(c);
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido !");
            return true;
        }
        System.out.println("Acesso Negado !");
        return false;
    }
    
    @Override
    public double getBonificacao(){
        return this.cargo.getSalario() * 0.15;
    }
    
    /*@Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }*/
}
