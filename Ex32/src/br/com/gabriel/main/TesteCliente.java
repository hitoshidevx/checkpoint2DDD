package br.com.gabriel.main;

import java.util.Iterator;
import java.util.Scanner;

import br.com.gabriel.model.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		int id, idade;
		String nome, email;
		
		for(int i = 0; i < listaClientes.length; i++) {
			Cliente cli = new Cliente();
			
			id = listaClientes.length + 1;
			
			cli.setId(id);
			
			System.out.println("\nDigite o nome do cliente");
			nome = sc.next();
			cli.setNome(nome);
			
			System.out.println("Digite o email do cliente");
			email = sc.next();
			cli.setEmail(email);
			
			System.out.println("Digite a idade do cliente");
			idade = sc.nextInt();
			cli.setIdade(idade);
			
			listaClientes[i] = cli;
		}
		
		System.out.println("\nClientes maiores de idade");
		for (Cliente cliente : listaClientes) {
			if(cliente.getIdade() >= 18) {
				System.out.printf("Nome: %s - Email: %s - Idade: %d\n", cliente.getNome(), cliente.getEmail(), cliente.getIdade());
			}
		}

	}

}
