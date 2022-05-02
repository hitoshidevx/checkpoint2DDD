import java.io.IOException;

public class Ex27 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num, count, resp;
		
		for(num = 1; num <= 20; num++) {
			for(count = 1; count <= 10; count++) {
				resp = num * count;
				System.out.printf("%d X %d = %d\n", num, count, resp);
				if(count ==  10) {
					System.out.println("\nAperte uma tecla\n");
					System.in.read();
				}
			}
		}

	}

}
