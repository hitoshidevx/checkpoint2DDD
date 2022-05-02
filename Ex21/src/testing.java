import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Insira um número positivo");
			num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("Erro. Sistema reiniciado\n");
			}
			
		} while(num <= 0);

		System.out.println("\nO número escolhido foi: " + num);
		
	}

}
