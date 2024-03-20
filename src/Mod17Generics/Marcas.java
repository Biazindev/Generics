package Mod17Generics;

public abstract class Marcas<T> {

	private String nome;
	
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getEstoque() {
		return estoque;
	}

	public void setEstoque(Double estoque) {
		this.estoque = estoque;
	}

	protected Double estoque;

    public abstract Double calcularEstoque();

       public void imprimirEstoque() {
        Double estoqueAtual = calcularEstoque();
        System.out.println("Estoque: " + estoqueAtual);
    }
}
