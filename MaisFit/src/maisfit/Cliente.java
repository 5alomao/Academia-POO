package maisfit;

public class Cliente extends Pessoa {

    private int codCliente;
    private static int cont;

    public static int getCont() {
        return Cliente.cont;
    }
     
    Cliente(){
        Cliente.cont = Cliente.cont + 1;
        this.codCliente = cont;
    }

    void mostraDadosCliente(){
        
        System.out.println("=-= Dados do Cliente =-=");
        System.out.println("Código do Cliente: "+this.codCliente);
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("---------------");
        
    }
    
}
