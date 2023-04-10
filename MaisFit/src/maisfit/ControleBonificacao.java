
package maisfit;

public class ControleBonificacao {
    
    public void registra(Funcionario f){
        System.out.println("Adicionando Bonificação");
        f.cargo.setSalario(f.getBonificacao());
    }
}
