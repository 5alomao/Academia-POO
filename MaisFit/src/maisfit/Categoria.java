package maisfit;

import java.util.List;

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

    public int getCodCategoria() {
        return codCategoria;
    }
    
    Categoria(){
        Categoria.cont = Categoria.cont + 1;
        this.codCategoria = cont;
    }
    
    public static void listarCategorias(List<Categoria> listCategoria){
        for(Categoria categoria : listCategoria){
            System.out.println("=-= Dados da Categoria =-=");
            System.out.println("Código da Categoria: "+categoria.getCodCategoria());
            System.out.println("Categoria: "+categoria.getCategoria());
            System.out.println("---------------");
        }
    }
}
