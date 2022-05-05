package br.com.gabriel.main;

import java.util.Scanner;

import br.com.gabriel.models.Cliente;
import br.com.gabriel.models.ContaBancaria;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[10];
		
		String nome, email;
		int id = 0, idade;
		char conta;
		
		int idAgencia;
		
		for(int i = 0; i < listaClientes.length; i++) {
			Cliente cli = new Cliente();
			
			id += 1;
			cli.setId(id);
			
			System.out.println("\nDigite o seu nome: ");
			nome = sc.next();
			cli.setNome(nome);
			
			System.out.println("Digite o seu email: ");
			email = sc.next();
			cli.setEmail(email);
			
			System.out.println("Digite a sua idade: ");
			idade = sc.nextInt();
			cli.setIdade(idade);
			
			System.out.println("Você tem uma conta bancária? (S/N)");
			conta = sc.next().toUpperCase().charAt(0);
			if(conta == 'S') {
				ContaBancaria cb = new ContaBancaria();
				
				System.out.println("Digite a agência: ");
				cb.setAgencia(sc.next());
				
				System.out.println("Digite o número: ");
				cb.setNumero(sc.next());
				
				System.out.println("Digite o saldo da conta: ");
				cb.setSaldo(sc.nextDouble());
				
			} else {
				cli.setConta(null);
			}
			listaClientes[i] = cli;
		}
		
		System.out.println("\nClientes cadastrados");
		for (Cliente cliente : listaClientes) {
			System.out.printf("Id: %d - Nome: %s - Email: %s - Idade: %d", cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
			if(cliente.getConta() != null) {
				System.out.printf("IdCliente: %d - Agência: %s - Número: %s - Saldo: %g\n", cliente.getId(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
			}
		}
	}

}
