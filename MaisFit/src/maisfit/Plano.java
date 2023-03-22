package maisfit;

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
    
    Plano(){
        Plano.cont = Plano.cont + 1;
        this.codPlano = cont;
    }

    void mostraDadosPlanos(){
        
        System.out.println("=-= Planos =-=");
        System.out.println("Código do Plano: "+this.codPlano);
        System.out.println("Tipo do Plano: "+this.tipo);
        System.out.println("Valor: "+this.valor);
        System.out.println("---------------");
        
    }
}
