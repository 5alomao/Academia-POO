package maisfit;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaisFit {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        List<Cliente> listCliente = new ArrayList();
        List<Funcionario> listFuncionario = new ArrayList();
        List<Cargo> listCargo = new ArrayList();
        List<Venda> listVenda = new ArrayList();
        List<Plano> listPlano = new ArrayList();
        List<Produto> listProduto = new ArrayList();
        List<Marca> listMarca = new ArrayList();
        List<Categoria> listCategoria = new ArrayList();
        
        //================================
        Cliente cli1 = new Cliente();
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
        Cliente cli2 = new Cliente();
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
        listCliente.add(cli1);
        listCliente.add(cli2);
        Cliente.listarClientes(listCliente);
        System.out.println("Total de Clientes: " + Cliente.getCont() + "\n");
        //================================
        Marca mar1 = new Marca();
        mar1.setMarca("Growth");
        Marca mar2 = new Marca();
        mar2.setMarca("BlackSkull");
        listMarca.add(mar1);
        listMarca.add(mar2);
        Marca.listarMarcas(listMarca);
        System.out.println("Total de Marcas:" + Marca.getCont());
        //================================
        Categoria cat1 = new Categoria();
        cat1.setCategoria("Suplementos");
        Categoria cat2 = new Categoria();
        cat2.setCategoria("Roupas");
        listCategoria.add(cat1);
        listCategoria.add(cat2);
        Categoria.listarCategorias(listCategoria);
        System.out.println("Total de Categorias:" + Categoria.getCont());
        //================================
        Produto prod1 = new Produto(cat1, mar1);
        prod1.setNome("Creatina");
        prod1.setValor(100);
        prod1.setQuantidade(30);
        /*
        System.out.println("Nome Produto:");
        prod1.setNome(ent.nextLine());
        System.out.println("Valor Produto:");
        prod1.setValor(ent.nextDouble());
        System.out.println("Quantidade:");
        prod1.setQuantidade(ent.nextInt());
         */
        Produto prod2 = new Produto(cat2, mar2);
        prod2.setNome("Blusa MaisFit");
        prod2.setValor(50.30);
        prod2.setQuantidade(20);
        /*
        System.out.println("Nome Produto:");
        prod2.setNome(ent.nextLine());
        System.out.println("Valor Produto:");
        prod2.setValor(ent.nextDouble());
        System.out.println("Quantidade:");
        prod2.setQuantidade(ent.nextInt());
         */
        listProduto.add(prod1);
        listProduto.add(prod2);
        Produto.listarProdutos(listProduto);
        System.out.println("Total de Produtos:" + Produto.getCont() + "\n");
        //================================
        Cargo car1 = new Cargo();
        car1.setTipo("Gerente");
        car1.setSalario(3000);
        Cargo car2 = new Cargo();
        car2.setTipo("Supervisor");
        car2.setSalario(2000);
        listCargo.add(car1);
        listCargo.add(car2);
        Cargo.listarCargos(listCargo);
        System.out.println("Total de Cargos:" + Cargo.getCont() + "\n");
        //================================
        Funcionario fun1 = new Gerente(car1);
        fun1.setNome("Isaac Silva");
        fun1.setCpf("321.321.321-32");
        fun1.setCtps("321.321-32");
        fun1.setTelefone("3295-0000");
        fun1.setEndereco("Centro");
        fun1.setNascimento("26/04/1998");
        fun1.getBonificacao();
        /*
        System.out.println("Nome Completo:");
        fun1.setNome(ent.nextLine());
        System.out.println("CPF:");
        fun1.setCpf(ent.nextLine());
        System.out.println("CTPS:");
        fun1.setCtps(ent.nextLine());
        System.out.println("Telefone:");
        fun1.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        fun1.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        fun1.setNascimento(ent.nextLine());
         */
        Funcionario fun2 = new Supervisor(car2);
        fun2.setNome("Eduardo Santos");
        fun2.setCpf("213-213-213-21");
        fun2.setCtps("213-213-21");
        fun2.setTelefone("3295-1111");
        fun2.setEndereco("Rua São Paulo");
        fun2.setNascimento("12/09/1993");
        fun2.getBonificacao();
        /*
        System.out.println("Nome Completo:");
        fun2.setNome(ent.nextLine());
        System.out.println("CPF:");
        fun2.setCpf(ent.nextLine());
        System.out.println("CTPS:");
        fun2.setCtps(ent.nextLine());
        System.out.println("Telefone:");
        fun2.setTelefone(ent.nextLine());
        System.out.println("Endereco:");
        fun2.setEndereco(ent.nextLine());
        System.out.println("Data de Nascimento:");
        fun2.setNascimento(ent.nextLine());
         */
        ControleBonificacao cbn = new ControleBonificacao();
        cbn.registra(fun1);
        cbn.registra(fun2);
        
        listFuncionario.add(fun1);
        listFuncionario.add(fun2);
        Funcionario.listarFuncionarios(listFuncionario);
        System.out.println("Total de Funcionarios:" + Funcionario.getCont() + "\n");
        
        //================================
        Plano plan1 = new Plano();
        plan1.setTipo("Mensal");
        plan1.setValor(100);
        /*
        System.out.println("Plano:");
        plan1.setTipo(ent.nextLine());
        System.out.println("Valor:");
        plan1.setValor(ent.nextDouble());
         */
        listPlano.add(plan1);
        Plano.listarPlanos(listPlano);
        System.out.println("Com Desconto: "+plan1.calculaDesconto(20));
        System.out.println("Total de Planos: " + Plano.getCont() + "\n");
        //================================
        Venda ven1 = new Venda(cli1,prod1);
        ven1.setFormaPagamento("Pix");
        ven1.setDataVenda("12/03/2023");
        ven1.setQuantidade(4);
        ven1.setDesconto(20);
        /*
        System.out.println("Forma de Pagamento:");
        ven1.setFormaPagamento(ent.nextLine());
        System.out.println("Data da Venda:");
        ven1.setDataVenda(ent.nextLine());
        System.out.println("Quantidade");
        ven1.setQuantidade(ent.nextInt());
        System.out.println("Desconto:");
        ven1.setDesconto(ent.nextInt());
         */
        Venda ven2 = new Venda(cli2,plan1);
        ven2.setFormaPagamento("Cartão de Crédito");
        ven2.setDataVenda("18/03/2023");
        ven2.setQuantidade(5);
        ven2.setDesconto(40);
        /*
        System.out.println("Forma de Pagamento:");
        ven2.setFormaPagamento(ent.nextLine());
        System.out.println("Data da Venda:");
        ven2.setDataVenda(ent.nextLine());
        System.out.println("Quantidade");
        ven2.setQuantidade(ent.nextInt());
        System.out.println("Desconto:");
        ven2.setDesconto(ent.nextInt());
         */
        listVenda.add(ven1);
        listVenda.add(ven2);
        Venda.listarVendas(listVenda);
        System.out.println("Total de Vendas: " + Venda.getCont() + "\n");
        //================================
    }
    
}
