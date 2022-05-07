package br.com.gabriel.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.gabriel.models.Cliente;
import br.com.gabriel.models.ContaBancaria;

public class Macgyver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		System.out.println("==> Banco Macgyver <==");
		
		int resposta;
		
		do {
			System.out.println("\nEscolha uma opção: \n1 - Criar cliente/conta"
					+ "\n2 - Depósito"
					+ "\n3 - Saque"
					+ "\n4 - Transferência"
					+ "\n5 - Consultar Saldo"
					+ "\n6 - Finalizar Sistema");
			
			resposta = sc.nextInt();
			
			if(resposta == 1) {
				
				Cliente cli = new Cliente();
				
				cli.setId(listaClientes.size() + 1);
				
				System.out.println("\nDigite o nome do cliente:");
				cli.setNome(sc.next());
				
				System.out.println("Digite a idade do cliente:");
				cli.setIdade(sc.nextInt());
				
				System.out.println("Digite a sua agência");
				String agencia = sc.next();
				
				System.out.println("Digite o número da sua agência");
				String numero = sc.next();
				
				double saldo = 0;
				
				ContaBancaria cb = new ContaBancaria(agencia, numero, saldo);
				
				cli.setConta(cb);
				
				listaClientes.add(cli);
				
				System.out.println("\nCliente cadastrado.");
				System.in.read();
				
			} else if (resposta == 2) {
				
				System.out.println("Em qual conta deseja depositar o saldo?");
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Idade: %d - Agência: %s - Número: %s",
					cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getConta().getAgencia(), cliente.getConta().getNumero());
				}
				
				System.out.println("\nDigite o Id:");
				int id = sc.nextInt();
				
				Cliente cli = listaClientes.get(id - 1);
				
				System.out.println("Digite o saldo que deseja depositar:");
				cli.getConta().Depositar(sc.nextDouble());
				
				System.out.println("\nSaldo adicionado! " + cli.getNome() + " tem: R$" + cli.getConta().ConsultarSaldo());
				System.in.read();
				
			} else if (resposta == 3) {
				System.out.println("\nDeseja sacar dinheiro de qual cliente?");
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Idade: %d - Agência: %s - Número: %s",
					cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getConta().getAgencia(), cliente.getConta().getNumero());
				}
				
				System.out.println("\nDigite o Id do cliente:");
				int id = sc.nextInt();
				
				Cliente cli = listaClientes.get(id - 1);
				
				System.out.println("\nQuanto dinheiro deseja sacar?");
				cli.getConta().Sacar(sc.nextDouble());
				System.out.println("\nPerfeito. Agora " + cli.getNome() + " possuí R$" + cli.getConta().ConsultarSaldo());
				System.in.read();
				
			} else if (resposta == 4) {
				
				System.out.println("Qual cliente deseja realizar a transferência?");
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Idade: %d - Agência: %s - Número: %s",
					cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getConta().getAgencia(), cliente.getConta().getNumero());
				}
				
				System.out.println("\nDigite o Id do cliente:");
				int id = sc.nextInt();
				
				Cliente cli = listaClientes.get(id - 1);
				
				System.out.println("Deseja transferir para qual cliente?");
				
				for (Cliente cliente : listaClientes) {
					if(cliente.getId() != id) {
						System.out.printf("\nId: %d - Nome: %s - Idade: %d - Agência: %s - Número: %s",
								cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getConta().getAgencia(), cliente.getConta().getNumero());
					}
				}
				
				System.out.println("\nDigite o Id do cliente escolhido:");
				int idEscolhido = sc.nextInt();
				
				Cliente destinatario = listaClientes.get(id - 1);
				double valorTransf;
				
				do {
					System.out.println("Quanto dinheiro deseja transferir?");
					valorTransf = sc.nextDouble();
					
					if(valorTransf > cli.getConta().getSaldo()) {
						System.out.println("\nVocê não pode transferir essa quantia de dinheiro.");
					} else {
						cli.getConta().Tranferir(valorTransf, destinatario);
					}
					
				} while (valorTransf > cli.getConta().getSaldo());
				
				System.out.println("\nTransferência concluída!");
				System.in.read();
				
			} else if (resposta == 5) {
				
				System.out.println("Deseja consultar o saldo de qual cliente?");
				
				for (Cliente cliente : listaClientes) {
					System.out.printf("\nId: %d - Nome: %s - Idade: %d - Agência: %s - Número: %s",
					cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getConta().getAgencia(), cliente.getConta().getNumero());
				}
				
				System.out.println("Digite o Id:");
				int id = sc.nextInt();
				Cliente cli = listaClientes.get(id - 1);
				
				System.out.println("\n" + cli.getNome() + " possuí R$" + cli.getConta().ConsultarSaldo());
				
				System.in.read();
				
			} else if (resposta == 6) {
				System.out.println("\nAlternativa Inválida. Sistema reiniciado.");
				System.in.read();
			}
			
		} while (resposta != 6);
		
		System.out.println("\nSistema Finalizado.");

	}

}
