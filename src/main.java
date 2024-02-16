import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite um numero: ");
		num2 = sc.nextInt();
		
		int soma = calculaSoma(num1, num2);
		
		System.out.println("Resultado da soma: " + soma);
		
	}

	private static int calculaSoma(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
