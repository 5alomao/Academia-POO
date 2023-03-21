package maisfit;

public class Marca {
    private String marca;
    private int codMarca;
    private static int cont;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getCont() {
        return Marca.cont;
    }
    
    Marca(){
        Marca.cont = Marca.cont + 1;
        this.codMarca = cont;
    }
     
}
