package exe01;
import java.util.*;
public class somarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Declaracao de variaveis
		int num1, num2, soma;
		
		//Leitura
		System.out.println("Digite um n�mero");
		num1 = sc.nextInt();
		System.out.println("Digite outro n�mero");
		num2 = sc.nextInt();
		
		//Soma
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma: " + soma);

	}

}
