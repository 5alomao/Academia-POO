package maisfit;

import java.util.List;

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

    public int getCodMarca() {
        return codMarca;
    }
    
    Marca(){
        Marca.cont = Marca.cont + 1;
        this.codMarca = cont;
    }
    
    public static void listarMarcas(List<Marca> listMarca){
        for(Marca marca : listMarca){
            System.out.println("=-= Dados da Marca =-=");
            System.out.println("Código da Marca: "+marca.getCodMarca());
            System.out.println("Marca: "+marca.getMarca());
            System.out.println("---------------");
        }
    }
     
}
