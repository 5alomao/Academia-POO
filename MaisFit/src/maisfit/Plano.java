package maisfit;

public class Plano {
    
    private String tipo;
    private double valor;
    private static int id;
    
    Plano(){
        Plano.id = Plano.id + 1;
    }

    void mostraDadosPlanos(){
        
        System.out.println("=-= Planos =-=");
        System.out.println("Tipo do Plano: "+this.tipo);
        System.out.println("Valor: "+this.valor);
        System.out.println("---------------");
        
    }
    
    public static int getId() {
        return Plano.id;
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
    
}
