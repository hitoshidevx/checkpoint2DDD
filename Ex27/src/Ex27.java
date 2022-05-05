import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, count, resp;
		
		for(num = 1; num <= 20; num++) {
			for(count = 1; count <= 10; count++) {
				resp = num * count;
				System.out.printf("%d X %d = %d\n", num, count, resp);
			}
			System.out.println("\nAperte uma tecla\n");
			sc.nextLine();
		}

	}

}
