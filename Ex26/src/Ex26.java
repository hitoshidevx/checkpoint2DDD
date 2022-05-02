import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, intervaloA, intervaloB;
		
		do {
			System.out.println("Digite o valor: ");
			num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("Erro. Valor inválido");
			}
				
		} while (num <= 0);
		
		do {
			System.out.println("Insira o valor do intervalo inicial: ");
			intervaloB = sc.nextInt();
			
			System.out.println("Insira o valor do intervalo final: ");
			intervaloA = sc.nextInt();
			
			if(intervaloA > intervaloB) {
				System.out.println("Erro. O intervalo inicial deve ser maior que o final.");
			}
			
		} while (intervaloA > intervaloB);
		
		System.out.printf("Valor: %d\nIntervalo inicial: %d\nIntervalo final: %d\n", num, intervaloB, intervaloA);
		
		for(int intervalo = intervaloB; intervalo > intervaloA - 1; intervalo--) {
			int resp = num * intervalo;
			System.out.printf("%d X %d = %d\n", num, intervalo, resp);
		}
		
		
		

	}

}
