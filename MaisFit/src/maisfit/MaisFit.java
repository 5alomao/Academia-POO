package maisfit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaisFit {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
        
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        cli1.setNome("Salomão Ferreira Junior");
        cli1.setCpf("174.133.196-08");
        cli1.setTelefone("997695915");
        cli1.setEndereco("Rua São Lucas");
        cli1.setNascimento("15/07/2003");
        /*
        System.out.println("Nome Completo:");
        cli1.setNome(ent.nextLine());
        System.out.println("CPF:");
        cli1.setCpf(ent.nextLine());
        System.out.println("Telefone:");
        cli1.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        cli1.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        cli1.setNascimento(ent.nextLine());
        */
        //================================
        cli2.setNome("Miguel");
        cli2.setCpf("123.123.123-12");
        cli2.setTelefone("99988-7766");
        cli2.setEndereco("Centro");
        cli2.setNascimento("12/05/2001");
        /*
        System.out.println("Nome Completo:");
        cli2.setNome(ent.nextLine());
        System.out.println("CPF:");
        cli2.setCpf(ent.nextLine());
        System.out.println("Telefone:");
        cli2.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        cli2.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        cli2.setNascimento(ent.nextLine());
        */
        //================================
        cli1.mostraDadosCliente();
        cli2.mostraDadosCliente();
        System.out.println("Total de Clientes: "+Cliente.getId()+"\n");
        //================================
        
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        
        prod1.setNome("Creatina");
        prod1.setMarca("Growth");
        prod1.setCategoria("Suplementos");
        prod1.setValor(69);
        prod1.setQuantidade(30);
        /*
        System.out.println("Nome Produto:");
        prod1.setNome(ent.nextLine());
        System.out.println("Marca:");
        prod1.setMarca(ent.nextLine());
        System.out.println("Categoria:");
        prod1.setCategoria(ent.nextLine());
        System.out.println("Valor Produto:");
        prod1.setValor(ent.nextDouble());
        System.out.println("Quantidade:");
        prod1.setQuantidade(ent.nextInt());
        */
        //================================
        prod2.setNome("HiperCalórico");
        prod2.setMarca("BlackSkull");
        prod2.setCategoria("Suplementos");
        prod2.setValor(89);
        prod2.setQuantidade(30);
        /*
        System.out.println("Nome Produto:");
        prod2.setNome(ent.nextLine());
        System.out.println("Marca:");
        prod2.setMarca(ent.nextLine());
        System.out.println("Categoria:");
        prod2.setCategoria(ent.nextLine());
        System.out.println("Valor Produto:");
        prod2.setValor(ent.nextDouble());
        System.out.println("Quantidade:");
        prod2.setQuantidade(ent.nextInt());
        */
        //================================
        prod1.mostraDadosProduto();
        prod2.mostraDadosProduto();
        System.out.println("Total de Produtos:"+Produto.getId()+"\n");
        //================================
        
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();
        
        fun1.setNome("Isaac Silva");
        fun1.setCpf("321.321.321-32");
        fun1.setCargo("Personal Trainer");
        fun1.setCtps("321.321-32");
        fun1.setTelefone("3295-0000");
        fun1.setEndereco("Centro");
        fun1.setNascimento("26/04/1998");
        /*
        System.out.println("Nome Completo:");
        fun1.setNome(ent.nextLine());
        System.out.println("CPF:");
        fun1.setCpf(ent.nextLine());
        System.out.println("Cargo:");
        fun1.setCargo(ent.nextLine());
        System.out.println("CTPS:");
        fun1.setCtps(ent.nextLine());
        System.out.println("Telefone:");
        fun1.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        fun1.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        fun1.setNascimento(ent.nextLine());
        */
        //================================
        fun2.setNome("Eduardo Santos");
        fun2.setCpf("213-213-213-21");
        fun2.setCargo("Personal Trainer");
        fun2.setCtps("213-213-21");
        fun2.setTelefone("3295-1111");
        fun2.setEndereco("Rua São Paulo");
        fun2.setNascimento("12/09/1993");
        /*
        System.out.println("Nome Completo:");
        fun2.setNome(ent.nextLine());
        System.out.println("CPF:");
        fun2.setCpf(ent.nextLine());
        System.out.println("Cargo:");
        fun2.setCargo(ent.nextLine());
        System.out.println("CTPS:");
        fun2.setCtps(ent.nextLine());
        System.out.println("Telefone:");
        fun2.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        fun2.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        fun2.setNascimento(ent.nextLine());
        */
        //================================
        fun1.mostraDadosFuncionario();
        fun2.mostraDadosFuncionario();
        System.out.println("Total de Funcionarios:"+Funcionario.getId()+"\n");
        //================================
    }
}

