package br.com.gabriel.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import br.com.gabriel.models.Cliente;
import br.com.gabriel.models.ContaBancaria;

public class TesteCliente {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		// Variaveis - Cliente
		String nome, email;
		int id, idade, resposta;
		char conta;
		
		// Variaveis - Conta Bancaria
		String agencia, numero;
		double saldo;
		
		System.out.println("==> Sistema de Cadastro de Alunos <==");
		
		do {
			System.out.println("\nEscolha uma opção: \n1 - Incluir Cliente "
					+ "\n2 - Atualizar Cliente "
					+ "\n3 - Excluir Cliente "
					+ "\n4 - Exibir Clientes "
					+ "\n5 - Finalizar Sistema ");
			
			resposta = sc.nextInt();
			
			if(resposta == 1) {
				Cliente cli = new Cliente();
				
				id = listaClientes.size() + 1;
				cli.setId(id);
				
				System.out.println("\nDigite o nome do cliente:");
				nome = sc.next();
				cli.setNome(nome);
				
				System.out.println("Digite a idade do cliente:");
				idade = sc.nextInt();
				cli.setIdade(idade);
				
				System.out.println("Digite o email do cliente:");
				email = sc.next();
				cli.setEmail(email);
				
				System.out.println("\nVocê possuí uma conta bancária?(S/N)");
				conta = sc.next().toUpperCase().charAt(0);
				if(conta == 'S') {
					ContaBancaria cb = new ContaBancaria();
					
					System.out.println("Digite a sua agência:");
					agencia = sc.next();
					cb.setAgencia(agencia);
					
					System.out.println("Digite o número da sua conta:");
					numero = sc.next();
					cb.setNumero(numero);
					
					System.out.println("Digite o saldo atual da sua conta:");
					saldo = sc.nextDouble();
					cb.setSaldo(saldo);
					
					cli.setConta(cb);
					
					
				} else {
					cli.setConta(null);
				}
				
				listaClientes.add(cli);
				System.out.println("\nCliente cadastrado.");
				System.in.read();
				
			} else if(resposta == 2) {
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Email: %s - Idade: %d", cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
				}
				
				System.out.println("\nDigite o Id do cliente");
				id = sc.nextInt();
				
				Cliente cli = listaClientes.get(id - 1);
				
				System.out.println("Digite o novo nome:");
				nome = sc.next();
				
				System.out.println("Digite o novo email:");
				cli.atualizarEmail(sc.next());
				
				System.out.println("Digite a nova idade:");
				idade = sc.nextInt();
				
				cli.setNome(nome);
				cli.setIdade(idade);
				
				System.out.println("\nCliente Atualizado.");
				System.in.read();
				
			} else if(resposta == 3) {
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Email: %s - Idade: %d", cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
				}
				
				System.out.println("\nDigite o Id do cliente");
				id = sc.nextInt();
				
				listaClientes.remove(id - 1);
				
				System.out.println("\nCliente excluído.");
				System.in.read();
				
			} else if(resposta == 4) {
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Email: %s - Idade: %d", cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
				}
				
				System.out.println("\nDeseja ver as contas dos clientes? (S/N)");
				char resp = sc.next().toUpperCase().charAt(0);
				if(resp == 'S') {
					for (Cliente cliente : listaClientes) {
						if(cliente.getConta() != null) {
							System.out.printf("\nCliente: %s - Agência: %s - Número: %s - Saldo: %g\n", cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
						} else {
							System.out.println("\n" + cliente.getNome() + " não possuí conta bancária.");
						}
					}
				} 
				
				System.out.println("\nClientes exibidos.");
				System.in.read();
				
			} else if(resposta > 5 | resposta < 0) {
				System.out.println("\nAlternativa inválida. Reiniciando Sistema");
				System.in.read();
			}
		} while (resposta != 5);
		
		System.out.println("\nSistema finalizado.");

	}

}
