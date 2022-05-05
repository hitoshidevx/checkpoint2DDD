
public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 1, n2 = 1, n3 = 1;
		
		for(int i = 0; i <= 20; i++) {
			System.out.println(n1);
			int n4 = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
		}
		
	}

}
