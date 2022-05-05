package br.com.gabriel.main;

import java.io.IOException;
import java.util.Scanner;

import br.com.gabriel.model.Produto;

public class TesteProduto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[5];
		
		int id, quantidade;
		double valor;
		String nome, descricao;
		
		for(int i = 0; i < listaProdutos.length; i++) {
			Produto pd = new Produto();
			
			id = listaProdutos.length + 1;
			pd.setId(id);
			
			System.out.println("\nInsira o nome do produto");
			nome = sc.next();
			pd.setNome(nome);
			
			System.out.println("Insira a descrição do produto");
			descricao = sc.next();
			pd.setDescricao(descricao);
			
			System.out.println("Qual o valor do produto?");
			valor = sc.nextDouble();
			pd.setValor(valor);
			
			System.out.println("Quantos produtos têm em estoque?");
			quantidade = sc.nextInt();
			pd.setQuantidade(quantidade);
			
			listaProdutos[i] = pd;
		}
		
				
		int resposta;
		do {
			System.out.println("\nVocê deseja:\n1 = Ver todos produtos\n2 = Ver produtos maiores que R$100\n3 = Ver produtos menores que R$100\n4 = Finalizar Sistema");
			resposta = sc.nextInt();
			
			if(resposta == 1) {
				System.out.println("\nTodos os produtos");
				for (Produto pd : listaProdutos) {
					System.out.printf("\nNome: %s - Descrição: %s - Valor: %g - Quantidade: %d", pd.getNome(), pd.getDescricao(), pd.getValor(), pd.getQuantidade());
				}
				System.in.read();
			} else if(resposta == 2) {
				System.out.println("\nProdutos maiores que R$100");
				for (Produto pd : listaProdutos) {
					if(pd.getValor() >= 100) {
						System.out.printf("\nNome: %s - Descrição: %s - Valor: %g - Quantidade: %d", pd.getNome(), pd.getDescricao(), pd.getValor(), pd.getQuantidade());
					}
					System.in.read();
				}
			} else if(resposta == 3) {
				System.out.println("\nProdutos maiores que R$100");
				for (Produto pd : listaProdutos) {
					if(pd.getValor() < 100) {
						System.out.printf("\nNome: %s - Descrição: %s - Valor: %g - Quantidade: %d", pd.getNome(), pd.getDescricao(), pd.getValor(), pd.getQuantidade());
					}
					System.in.read();
				}
			} 
		} while (resposta != 4);
		
		System.out.println("\nSistema Finalizado");

	}

}
