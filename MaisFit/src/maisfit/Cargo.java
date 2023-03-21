package maisfit;

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
    
    Cargo(){
        Cargo.cont = Cargo.cont + 1;
        this.codCargo = cont;
    }
    
}
