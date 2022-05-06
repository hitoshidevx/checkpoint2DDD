package br.com.gabriel.models;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	public Cliente() {}
	
	public Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeEIdade() {
		return "Nome: " + this.nome + " - " + "Idade: " + this.idade;
	}

	public String exibirDadosConta() {
		if(this.conta != null) {
			return "Id Cliente: " + this.id + " - " +
				   "Ag�ncia: " + this.conta.getAgencia() + " - " +
				   "N�mero: " + this.conta.getNumero() + " - " +
				   "Saldo: " + this.conta.getSaldo();
 		} else {
			return "Esse cliente n�o possui conta.";
		}
	}
	
}