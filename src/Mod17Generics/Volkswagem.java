package Mod17Generics;


public class Volkswagem extends Marcas<GenericsClassApp> {
    
    private String nome;

    private Double quantidadeProduzida;
    
    private Double quantidadeVendida;
    
    public Double calcularEstoque() {
        return quantidadeProduzida - quantidadeVendida;
    }
    
    public Double estoque() {
        double produzido = quantidadeProduzida != null ? quantidadeProduzida : 0.0;
        double vendido = quantidadeVendida != null ? quantidadeVendida : 0.0; 
        return produzido - vendido;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(Double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
