package maisfit;

import java.util.List;

public class Cliente extends Pessoa {

    private int codCliente;
    private static int cont;
    

    public static int getCont() {
        return Cliente.cont;
    }

    public int getCodCliente() {
        return codCliente;
    }
     
    Cliente(){
        Cliente.cont = Cliente.cont + 1;
        this.codCliente = cont;
    }

    public static void listarClientes(List<Cliente> listCliente){
        for(Cliente cliente : listCliente){
            System.out.println("=-= Dados do Cliente =-=");
            System.out.println("Código do Cliente: "+cliente.getCodCliente());
            System.out.println("Nome: "+cliente.getNome());
            System.out.println("CPF: "+cliente.getCpf());
            System.out.println("Telefone: "+cliente.getTelefone());
            System.out.println("Data de Nascimento: "+cliente.getNascimento());
            System.out.println("Endereço: "+cliente.getEndereco());
            System.out.println("---------------"); 
        }
    }
    
}
