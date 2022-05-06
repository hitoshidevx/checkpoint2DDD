package br.com.gabriel.models;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Produto() {}
	
	public Produto(int id, String nome, double preco, int quantidade, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public String exibirNomeEPreco() {
		return "Nome: " + this.nome + " - " + "Pre�o: " + this.preco;
	}
	
	public String exibirNomeECategoria() {
		if(this.categoria == null) {
			return "Nome: " + this.nome + " - " + " Sem categoria";
		} else  {
			return "Nome: " + this.nome + " - " + "Categoria: " + this.categoria.getNome(); 
		}
	}

}
