
public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fibonacci
		
		int n1 = 1, n2 = 0 , count;
		
		for(count = 1; count <= 30; count++) {
			System.out.println(n1);
			n1 = n1 + n2;
			n2 = n1 - n2;
			
		}

	}

}
