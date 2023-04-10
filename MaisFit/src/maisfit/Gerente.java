
package maisfit;

public class Gerente extends Funcionario {
    
    public Gerente(Cargo c) {
        super(c);
    }
    
    @Override
    public double getBonificacao() {
        return super.cargo.getSalario() + 1000;
    }


    
}   
