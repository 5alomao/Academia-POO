package maisfit;

public class TestaGerente {
    public static void main(String[] args) {
        
        Cargo c1 = new Cargo();
        c1.setTipo("Gerente");
        c1.setSalario(5000.00);
        
        Gerente g1 = new Gerente(c1);
        g1.setNome("Pedro Franco");
        g1.setSenha(12345);
        g1.setNumFuncGerenciados(30);
        g1.mostraDadosFuncionario();
        g1.getBonificacao();
        
        g1.autentica(12345);
        System.out.println("Bonificação:"+g1.getBonificacao());
        g1.mostraDadosFuncionario();
        
    }
}
