package maisfit;

import java.util.Scanner;

public class MaisFit {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        /*
        Cliente cli1 = new Cliente();
        System.out.println("Nome Completo:");
        cli1.setNome(ent.nextLine());
        System.out.println("Insira o seu CPF:");
        cli1.setCpf(ent.nextLine());
        System.out.println("Telefone: ");
        cli1.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        cli1.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        cli1.setNascimento(ent.nextLine());
        cli1.mostraDadosCliente();
        //==============================================
        Funcionario fun1 = new Funcionario();
        System.out.println("Nome Completo:");
        fun1.setNome(ent.nextLine());
        System.out.println("Insira o seu CPF");
        fun1.setCpf(ent.nextLine());
        System.out.println("Telefone: ");
        fun1.setTelefone(ent.nextLine());
        System.out.println("CTPS:");
        fun1.setCtps(ent.nextLine());
        System.out.println("Cargo");
        fun1.cargo.setCargo(ent.nextLine());
        System.out.println("Endereco:");
        fun1.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        fun1.setNascimento(ent.nextLine());
        fun1.mostraDadosFuncionario();
        //==============================================
        */
        Produto prod1 = new Produto();
        System.out.println("Nome Produto:");
        prod1.setNome(ent.nextLine());
        
        System.out.println("Valor Produto:");
        prod1.setValor(ent.nextDouble());
        
        System.out.println("Quantidade:");
        prod1.setQuantidade(ent.nextInt());
        
        System.out.println("Categoria:");
        prod1.categoria.setNome(ent.nextLine());
        
        System.out.println("Marca:");
        prod1.marca.setNome(ent.nextLine());
        
        prod1.mostraDadosProduto();
        //==============================================
        
    }
    
}
