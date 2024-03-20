package Mod17Generics;

public class GenericsClassApp<T> extends App  {

    public void imprimirNome(Marcas<T> marca) { 
        System.out.println("Veículo: " +  " " + marca.getNome()+ " " + "Em estoque: "  + " " + marca.calcularEstoque());
    }
    public static void imprimirMarcas(Marcas<?> marcas) {
        marcas.imprimirEstoque();
        

    }
}