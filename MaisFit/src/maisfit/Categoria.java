package maisfit;

public class Categoria {
    private String categoria;
    private int codCategoria;
    private static int cont;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static int getCont() {
        return Categoria.cont;
    }
    
    Categoria(){
        Categoria.cont = Categoria.cont + 1;
        this.codCategoria = cont;
    }
}
