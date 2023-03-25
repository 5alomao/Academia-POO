package maisfit;

import java.util.List;

public class Plano {
    
    private String tipo;
    private double valor;
    private int codPlano;
    private static int cont;
    
    public static int getCont() {
        return Plano.cont;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodPlano() {
        return codPlano;
    }
    
    Plano(){
        Plano.cont = Plano.cont + 1;
        this.codPlano = cont;
    }
    
    public static void listarPlanos(List<Plano> listPlano){
        for(Plano plano : listPlano){
            System.out.println("=-= Dados do Plano =-=");
            System.out.println("Código do Plano: "+plano.getCodPlano());
            System.out.println("Tipo do Plano: "+plano.getTipo());
            System.out.println("Valor: "+plano.getValor());
            System.out.println("---------------");
        }
    }
}
