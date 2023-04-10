
package maisfit;

public class Supervisor extends Funcionario {

    public Supervisor(Cargo c) {
        super(c);
    }

    @Override
    public double getBonificacao() {
        return super.cargo.getSalario() + 500;
    }
    
}
