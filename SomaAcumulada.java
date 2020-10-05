import java.util.Scanner;

public class SomaA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Tamanho do array: ");
		n = sc.nextInt();
		
		int[] nums = new int[n];
		int[] numsSomaA = new int[n];
		
		System.out.print("Entre com os valores do array: ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < nums.length; i++) {
			soma += nums[i];
			numsSomaA[i] = soma;
		}
		
		for(int i = 0; i < numsSomaA.length; i++) {
			System.out.print(numsSomaA[i] + " ");
		}
		
		sc.close();
	}
}
