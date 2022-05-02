import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Agora insira o segundo número: ");
		num2 = sc.nextInt();
		
		while(num1 > num2) {
			System.out.println("\nErro. O segundo número DEVE ser maior que o primeiro\n\nInsira novamente o segundo número: ");
			num2 = sc.nextInt();
		}

		System.out.printf("\nNúmeros escolhidos: %d e %d", num1, num2);
		
	}

}
