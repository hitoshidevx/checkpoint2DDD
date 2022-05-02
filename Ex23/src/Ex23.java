import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String sexo;
		String f = "f";
		String F = "F";
		String m = "m";
		String M = "M";

		do {
			System.out.println("Digite o seu sexo\nF = Feminino | M = Masculino");
			sexo = sc.next();
			
			if(sexo.equals(M) | sexo.equals(m) | sexo.equals(F) | sexo.equals(f)) {
				break;
			}
			
			System.out.println("\nErro. Insira novamente");
		}while(sexo != "F" | sexo != "f" | sexo != "M" | sexo != "m");
		
		if(sexo.equals(M) | sexo.equals(m)) {
			System.out.println("Você é do sexo masculino");
		} else {
			System.out.println("Você é do sexo feminino");
		}
		
	}

}
