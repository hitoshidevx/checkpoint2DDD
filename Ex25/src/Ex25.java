import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, count, resp;
		
		do {
			System.out.println("Digite um número positivo e veja a tabuada dele");
			num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("\nErro. Valor não é positivo. Sistema reiniciado\n");
			}
			
		} while (num <= 0);
		
		System.out.println("\nNúmero escolhido: " + num);
		for(count = 1; count < 11; count++) {
			resp = num * count;
			System.out.printf("%d X %d = %d\n", num, count, resp);
		}

	}

}
