package br.com.gabriel.main;

import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.gabriel.models.Categoria;
import br.com.gabriel.models.Produto;

public class TesteProduto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		int resposta;
		char categoria;
		
		System.out.println("==> Sistema de Cadastro de Produtos <==");
		
		do {
			System.out.println("\nEscolha uma opção: \n1 - Incluir Produto "
					+ "\n2 - Atualizar Produto "
					+ "\n3 - Excluir Produto "
					+ "\n4 - Exibir Produtos "
					+ "\n5 - Finalizar Sistema ");
			
			resposta = sc.nextInt();
			
			if(resposta == 1) {
				Produto pd = new Produto();
			
				pd.setId(listaProdutos.size() + 1);
				
				System.out.println("\nDigite o nome do produto:");
				pd.setNome(sc.next());
				
				System.out.println("Digite o preço do produto:");
				pd.setPreco(sc.nextDouble());
				
				System.out.println("Digite o estoque do produto:");
				pd.setQuantidade(sc.nextInt());
				
				System.out.println("O produto possuí categoria? (S/N)");
				categoria = sc.next().toUpperCase().charAt(0);
				if(categoria == 'S') {
					int id = pd.getId();
					
					System.out.println("Digite o nome da categoria do produto");
					String nome = sc.next();
					
					Categoria ct = new Categoria(id, nome);
					
					pd.setCategoria(ct);
				} else {
					pd.setCategoria(null);
				}
				
				listaProdutos.add(pd);
				
				System.out.println("\nProduto cadastrado.");
				System.in.read();
				
			} else if (resposta == 2) {
				
				System.out.println("\nEscolha o Id do produto que deseja alterar:");
				
				for (Produto produto : listaProdutos) {
					if(produto.getCategoria() != null) {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: %s", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.getCategoria().getNome());
					} else {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: N/A", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					}
				}
				
				int id = sc.nextInt();
				Produto pd = listaProdutos.get(id - 1);
				
				System.out.println("Digite o novo nome:");
				pd.setNome(sc.next());
				
				System.out.println("Digite o novo preço:");
				pd.setPreco(sc.nextDouble());
				
				System.out.println("Digite a novo quantidade:");
				pd.setQuantidade(sc.nextInt());
				
				System.out.println("Digite a nova categoria:");
				if(pd.getCategoria() != null) {
					pd.getCategoria().setNome(sc.next());
				} else {
					System.out.println("\nO produto não foi cadastrado com uma categoria.");
				}
				
				System.out.println("\nProduto alterado.");
				System.in.read();
				
			} else if (resposta == 3) {
				
				System.out.println("\nEscolha o produto que deseja excluir:");
				
				for (Produto produto : listaProdutos) {
					if(produto.getCategoria() != null) {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: %s", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.getCategoria().getNome());
					} else {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: N/A", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					}
				}
				
				int id = sc.nextInt();
				listaProdutos.remove(id - 1);
				
				System.out.println("\nProduto excluído.");
				System.in.read();
				
			} else if (resposta == 4) {
				System.out.println("\nProdutos cadastrados:");
				for (Produto produto : listaProdutos) {
					if(produto.getCategoria() != null) {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: %s", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.getCategoria().getNome());
					} else {
						System.out.printf("\nId: %d - Nome: %s - Preço: %g - Quantidade: %s - Categoria: N/A", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					}
				}
				
				System.in.read();
				
			} else if (resposta > 5 | resposta < 0) {
				System.out.println("\nAlternativa inválida. Reiniciando sistema.");
				System.in.read();
			}
			
		} while (resposta != 5);
		
		System.out.println("\nSistema finalizado.");
		
	}

}
