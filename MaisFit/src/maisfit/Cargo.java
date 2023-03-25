package maisfit;

import java.util.List;

public class Cargo {
    private String tipo;
    private double salario;
    private static int cont;
    private int codCargo;
    
    public static int getCont() {
        return Cargo.cont;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodCargo() {
        return codCargo;
    }
    
    Cargo(){
        Cargo.cont = Cargo.cont + 1;
        this.codCargo = cont;
    }
    
    public static void listarCargos(List<Cargo> listCargo){
        for(Cargo cargo : listCargo){
            System.out.println("=-= Dados do Cargo =-=");
            System.out.println("Código do Cargo:"+cargo.getCodCargo());
            System.out.println("Cargo:"+cargo.getTipo());
            System.out.println("Salário:"+cargo.getSalario());
            System.out.println("---------------");
        }
    }
    
}
