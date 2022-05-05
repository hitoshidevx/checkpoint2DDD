import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num, valor = 1, soma = 1;
		
		do {
			System.out.println("Digite um valor positivo menor que 100: ");
			num = sc.nextInt();
			
			for(int i = 0; i < num; i++) {
				valor += soma;
				soma += 2;
				System.out.println(valor);
			}
			
			if(num <= 0 | num > 100) {
				System.out.println("Erro. Sistema reiniciado");
			}
			
		} while (num  <= 0 | num > 100);
		
	}

}
