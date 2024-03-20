package Mod17Generics;

public class App extends Marcas<GenericsClassApp> {

    public static void main(String args[]) {
        
        Ford ford = new Ford();
        ford.setNome("Focus");
        ford.setQuantidadeProduzida(1000d);
        ford.setQuantidadeVendida(780d);
        GenericsClassApp<GenericsClassApp> genericsApp = new GenericsClassApp<>();
        System.out.println("Ford");
        genericsApp.imprimirNome(ford);
        
        Hyundai hyundai = new Hyundai();
        hyundai.setNome("I30");
        hyundai.setQuantidadeProduzida(1500d);
        hyundai.setQuantidadeVendida(1255d);
        System.out.println("Hyundai");
        genericsApp.imprimirNome(hyundai);
        
        Volkswagem volks = new Volkswagem();
        volks.setNome("Jetta");
        volks.setQuantidadeProduzida(2000d);
        volks.setQuantidadeVendida(1650d);
        System.out.println("Volkswagem");
        genericsApp.imprimirNome(volks);
    }
    
}
