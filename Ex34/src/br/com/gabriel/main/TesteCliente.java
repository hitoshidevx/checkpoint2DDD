package br.com.gabriel.main;

import java.util.Scanner;

import br.com.gabriel.model.Cliente;
import br.com.gabriel.model.ContaBancaria;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		String nome, email;
		int id = 0, idade;
		char conta;
		
		String agencia, numero;
		double saldo;
		
		for(int i = 0; i < listaClientes.length; i++) {
			
			Cliente cli = new Cliente();
			
			id += 1;
			cli.setId(id);
			
			System.out.println("\nDigite o seu nome");
			nome = sc.next();
			cli.setNome(nome);
			
			System.out.println("Digite o seu email");
			email = sc.next();
			cli.setEmail(email);
			
			System.out.println("Digite a sua idade");
			idade = sc.nextInt();
			cli.setIdade(idade);
			
			System.out.println("\nVocê possui conta bancária?\nS = Sim | N = não");
			conta = sc.next().toUpperCase().charAt(0);
			
			if(conta == 'S') {
				ContaBancaria ct = new ContaBancaria();
				
				System.out.println("\nDigite o nome da agência");
				agencia = sc.next();
				ct.setAgencia(agencia);
				
				System.out.println("Digite o número da agência");
				numero = sc.next();
				ct.setNumero(numero);
				
				System.out.println("Digite o saldo atual da sua conta");
				saldo = sc.nextDouble();
				ct.setSaldo(saldo);
				
				cli.setConta(ct);
				
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
