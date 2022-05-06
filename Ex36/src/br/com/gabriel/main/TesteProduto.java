package br.com.gabriel.main;

import java.util.Scanner;

import br.com.gabriel.models.Categoria;
import br.com.gabriel.models.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[3];
		
		char categoria;
		
		for(int i = 0; i < listaProdutos.length; i++) {
			Produto pd = new Produto();
			
			System.out.println("Digite o nome do produto");
			pd.setNome(sc.next());
			
			System.out.println("Digite o preço do produto");
			pd.setPreco(sc.nextDouble());
			
			System.out.println("Digite a quantidade do produto");
			pd.setQuantidade(sc.nextInt());
			
			System.out.println("O produto tem categoria? (S/N)");
			categoria = sc.next().toUpperCase().charAt(0);
			
			if(categoria == 'S') {
				Categoria ct = new Categoria();
				
				System.out.println("Digite o nome da categoria do produto");
				ct.setNome(sc.next());
				
				pd.setCategoria(ct);
			} else {
				pd.setCategoria(null);
			}
			listaProdutos[i] = pd;
		}
		
		System.out.println("Todos os produtos:");
		for (Produto produto : listaProdutos) {
			System.out.printf(produto.exibirNomeECategoria() + "\n");
		}

	}

}
